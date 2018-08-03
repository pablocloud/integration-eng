package es.pabloverdugo.integrationengine.flights.mappers.kiwi;

import es.pabloverdugo.integrationengine.flights.domain.Country;
import es.pabloverdugo.integrationengine.flights.domain.external.kiwi.KiwiCountry;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface KiwiCountryToCountryMapper {

    Country kiwiCountryToCountry(KiwiCountry kiwiCountry);

}
