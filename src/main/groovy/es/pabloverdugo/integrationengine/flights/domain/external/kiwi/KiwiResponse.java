package es.pabloverdugo.integrationengine.flights.domain.external.kiwi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class KiwiResponse implements Serializable {

    @JsonProperty(value = "search_params")
    private KiwiSearchParams kiwiSearchParams;

    @JsonProperty(value = "currency_rate")
    private Double currencyRate;

    private Long time;
    private String currencyCode;
    private List<KiwiData> data;

    public KiwiResponse() {

    }

    public KiwiResponse(KiwiSearchParams kiwiSearchParams, Long time, String currencyCode, Double currencyRate, List<KiwiData> data) {
        this.kiwiSearchParams = kiwiSearchParams;
        this.time = time;
        this.currencyCode = currencyCode;
        this.currencyRate = currencyRate;
        this.data = data;
    }

    public KiwiSearchParams getKiwiSearchParams() {
        return kiwiSearchParams;
    }

    public void setKiwiSearchParams(KiwiSearchParams kiwiSearchParams) {
        this.kiwiSearchParams = kiwiSearchParams;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public List<KiwiData> getData() {
        return data;
    }

    public void setData(List<KiwiData> data) {
        this.data = data;
    }

}
