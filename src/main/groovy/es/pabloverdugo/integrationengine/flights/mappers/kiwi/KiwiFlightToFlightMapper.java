package es.pabloverdugo.integrationengine.flights.mappers.kiwi;

import es.pabloverdugo.integrationengine.flights.domain.Flight;
import es.pabloverdugo.integrationengine.flights.domain.external.kiwi.KiwiFlight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {KiwiAirlineToAirlineMapper.class},
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface KiwiFlightToFlightMapper {

    @Mappings({
            @Mapping(source = "flightNo", target = "number"),
            @Mapping(source = "dTimeUTC", target = "departureTimeUtc"),
            @Mapping(source = "aTimeUTC", target = "arrivalTimeUtc"),
            @Mapping(source = "flyFrom", target = "iataFrom"),
            @Mapping(source = "flyTo", target = "iataTo"),
            @Mapping(source = "airline", target = "airline")
    })
    Flight kiwiFlightToFlight(KiwiFlight kiwiFlight);

}
