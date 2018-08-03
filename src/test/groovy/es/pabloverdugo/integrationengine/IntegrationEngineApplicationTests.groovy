package es.pabloverdugo.integrationengine

import com.fasterxml.jackson.databind.ObjectMapper
import com.mashape.unirest.http.Unirest
import es.pabloverdugo.integrationengine.flights.domain.external.kiwi.KiwiResponse
import es.pabloverdugo.integrationengine.flights.mappers.kiwi.KiwiAirlineToAirlineMapper
import es.pabloverdugo.integrationengine.flights.mappers.kiwi.KiwiAvailabilityMapper
import es.pabloverdugo.integrationengine.flights.mappers.kiwi.KiwiFlightToFlightMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class IntegrationEngineApplicationTests {

    @Autowired
    ObjectMapper objectMapper

    @Autowired
    KiwiAirlineToAirlineMapper kiwiAirlineToAirlineMapper

    @Autowired
    KiwiFlightToFlightMapper kiwiFlightToFlightMapper

    @Autowired
    KiwiAvailabilityMapper kiwiAvailabilityMapper

    def basicKiwiRequestResponse() {
        def request = Unirest.get('https://api.skypicker.com/flights')
        def params = [
                'flyFrom' : 'MAD',
                'to'      : 'BCN',
                'dateFrom': new Date().format('dd/MM/yyyy')
        ]
        def response = request.queryString(params).asString()
        return response
    }

    @Test
    void kiwiAvailability() {
        def kiwiResponse = objectMapper.readValue(basicKiwiRequestResponse().body, KiwiResponse)
        println kiwiResponse
    }

    @Test
    void testKiwiAirlineMapping() {
        def kiwiResponse = objectMapper.readValue(basicKiwiRequestResponse().body, KiwiResponse)
        def airlines = []
        kiwiResponse.data.each {
            it.route.each {
                airlines.add(
                        kiwiAirlineToAirlineMapper.kiwiAirlineToAirline(it.airline)
                )
            }
        }
        println airlines
    }

    @Test
    void testKiwiFlightMapping() {
        def kiwiResponse = objectMapper.readValue(basicKiwiRequestResponse().body, KiwiResponse)
        def flights = []
        kiwiResponse.data.each {
            it.route.each {
                flights.add(kiwiFlightToFlightMapper.kiwiFlightToFlight(it))
            }
        }
        println flights
    }

    @Test
    void testKiwiAvailabilityMapping() {
        def kiwiResponse = objectMapper.readValue(basicKiwiRequestResponse().body, KiwiResponse)
        def availabilities = []
        kiwiResponse.data.each {
            availabilities.add(kiwiAvailabilityMapper.kiwiAvailabilityToAvailability(it))
        }
        println availabilities
    }

}
