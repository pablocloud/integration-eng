package es.pabloverdugo.integrationengine.flights.mappers.kiwi;

import es.pabloverdugo.integrationengine.flights.domain.Airline;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface KiwiAirlineToAirlineMapper {

    @Mappings({
            @Mapping(source = "airline", target = "iataCode")
    })
    Airline kiwiAirlineToAirline(String airline);

}
