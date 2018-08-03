package es.pabloverdugo.integrationengine.flights.mappers.kiwi;

import es.pabloverdugo.integrationengine.flights.domain.Country;
import es.pabloverdugo.integrationengine.flights.domain.external.kiwi.KiwiCountry;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface KiwiCountryToCountryMapper {

    @Mappings({
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "code", target = "code")
    })
    Country kiwiCountryToCountry(KiwiCountry kiwiCountry);

}
