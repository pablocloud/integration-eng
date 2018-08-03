package es.pabloverdugo.integrationengine.flights.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Flight implements Serializable {

    @Id
    @GeneratedValue
    Long id

    Integer number
    Long departureTimeUtc
    Long arrivalTimeUtc
    String iataFrom
    String iataTo
    String cityFrom
    String cityTo
    Airline airline

}
