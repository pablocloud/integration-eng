package es.pabloverdugo.integrationengine.flights.domain.external.kiwi;

import java.io.Serializable;

public class KiwiCountry implements Serializable {

    private String code;
    private String name;

    public KiwiCountry() {

    }

    public KiwiCountry(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
