package es.pabloverdugo.integrationengine.flights.domain.external.kiwi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class KiwiSearchParams implements Serializable {

    @JsonProperty(value = "to_type")
    private String toType;

    @JsonProperty(value = "flyFrom_type")
    private String flyFromType;

    public KiwiSearchParams() {

    }

    public KiwiSearchParams(String toType, String flyFromType) {
        this.toType = toType;
        this.flyFromType = flyFromType;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    public String getFlyFromType() {
        return flyFromType;
    }

    public void setFlyFromType(String flyFromType) {
        this.flyFromType = flyFromType;
    }

}
