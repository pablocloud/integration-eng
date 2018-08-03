package es.pabloverdugo.integrationengine.flights.mappers.kiwi;

import es.pabloverdugo.integrationengine.flights.domain.Availability;
import es.pabloverdugo.integrationengine.flights.domain.external.kiwi.KiwiData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        uses = {
                KiwiFlightToFlightMapper.class,
                KiwiCountryToCountryMapper.class
        },
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface KiwiAvailabilityMapper {

    @Mappings({
            @Mapping(source = "kiwiCountryTo", target = "countryTo"),
            @Mapping(source = "kiwiCountryFrom", target = "countryFrom"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "route", target = "route")
    })
    Availability kiwiAvailabilityToAvailability(KiwiData kiwiData);

}
