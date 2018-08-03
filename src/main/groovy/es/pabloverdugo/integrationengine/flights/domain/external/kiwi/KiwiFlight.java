package es.pabloverdugo.integrationengine.flights.domain.external.kiwi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class KiwiFlight implements Serializable {

    @JsonProperty(value = "bags_recheck_required")
    private Boolean bagsRecheckRequired;

    @JsonProperty(value = "flight_no")
    private Integer flightNo;

    private Long dTimeUTC;
    private Long aTimeUTC;
    private Long dTime;
    private Long aTime;
    private String mapIdfrom;
    private String mapIdto;
    private String cityFrom;
    private String cityTo;
    private String flyFrom;
    private String flyTo;
    private Double latFrom;
    private Double lngFrom;
    private Double latTo;
    private Double lngTo;
    private String airline;

    public KiwiFlight() {

    }

    public KiwiFlight(Boolean bagsRecheckRequired, Integer flightNo, Long dTimeUTC, Long aTimeUTC, Long dTime, Long aTime, String mapIdfrom,
                      String mapIdto, String cityFrom, String cityTo, String flyFrom, String flyTo, Double latFrom, Double lngFrom, Double latTo,
                      Double lngTo, String airline) {
        this.bagsRecheckRequired = bagsRecheckRequired;
        this.flightNo = flightNo;
        this.dTimeUTC = dTimeUTC;
        this.aTimeUTC = aTimeUTC;
        this.dTime = dTime;
        this.aTime = aTime;
        this.mapIdfrom = mapIdfrom;
        this.mapIdto = mapIdto;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.latFrom = latFrom;
        this.lngFrom = lngFrom;
        this.latTo = latTo;
        this.lngTo = lngTo;
        this.airline = airline;
    }

    public Boolean getBagsRecheckRequired() {
        return bagsRecheckRequired;
    }

    public void setBagsRecheckRequired(Boolean bagsRecheckRequired) {
        this.bagsRecheckRequired = bagsRecheckRequired;
    }

    public Integer getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(Integer flightNo) {
        this.flightNo = flightNo;
    }

    public Long getdTimeUTC() {
        return dTimeUTC;
    }

    public void setdTimeUTC(Long dTimeUTC) {
        this.dTimeUTC = dTimeUTC;
    }

    public Long getaTimeUTC() {
        return aTimeUTC;
    }

    public void setaTimeUTC(Long aTimeUTC) {
        this.aTimeUTC = aTimeUTC;
    }

    public Long getdTime() {
        return dTime;
    }

    public void setdTime(Long dTime) {
        this.dTime = dTime;
    }

    public Long getaTime() {
        return aTime;
    }

    public void setaTime(Long aTime) {
        this.aTime = aTime;
    }

    public String getMapIdfrom() {
        return mapIdfrom;
    }

    public void setMapIdfrom(String mapIdfrom) {
        this.mapIdfrom = mapIdfrom;
    }

    public String getMapIdto() {
        return mapIdto;
    }

    public void setMapIdto(String mapIdto) {
        this.mapIdto = mapIdto;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    public Double getLatFrom() {
        return latFrom;
    }

    public void setLatFrom(Double latFrom) {
        this.latFrom = latFrom;
    }

    public Double getLngFrom() {
        return lngFrom;
    }

    public void setLngFrom(Double lngFrom) {
        this.lngFrom = lngFrom;
    }

    public Double getLatTo() {
        return latTo;
    }

    public void setLatTo(Double latTo) {
        this.latTo = latTo;
    }

    public Double getLngTo() {
        return lngTo;
    }

    public void setLngTo(Double lngTo) {
        this.lngTo = lngTo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

}
