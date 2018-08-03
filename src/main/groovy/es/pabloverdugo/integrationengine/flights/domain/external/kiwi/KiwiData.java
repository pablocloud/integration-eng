package es.pabloverdugo.integrationengine.flights.domain.external.kiwi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class KiwiData implements Serializable {

    @JsonProperty(value = "return_duration")
    private String returnDuration;

    @JsonProperty(value = "fly_duration")
    private String flyDuration;

    private String mapIdfrom;
    private String mapIdTo;
    private String flyTo;
    private String flyFrom;
    private String cityTo;
    private String cityFrom;
    private Integer nightsInDest;
    private KiwiCountry kiwiCountryTo;
    private KiwiCountry kiwiCountryFrom;
    private KiwiBagLimit baglimit;
    private Long dTimeUTC;
    private Long aTimeUTC;
    private Long dTime;
    private Long aTime;
    private Double distance;
    private Double price;
    private List<KiwiFlight> route;

    public KiwiData() {

    }

    public KiwiData(String mapIdfrom, String mapIdTo, String returnDuration, String flyDuration, String flyTo, String flyFrom,
                    String cityTo, String cityFrom, Integer nightsInDest, KiwiCountry kiwiCountryTo, KiwiCountry kiwiCountryFrom, KiwiBagLimit baglimit,
                    Long dTimeUTC, Long aTimeUTC, Long dTime, Long aTime, Double distance, Double price, List<KiwiFlight> route) {
        this.mapIdfrom = mapIdfrom;
        this.mapIdTo = mapIdTo;
        this.returnDuration = returnDuration;
        this.flyDuration = flyDuration;
        this.flyTo = flyTo;
        this.flyFrom = flyFrom;
        this.cityTo = cityTo;
        this.cityFrom = cityFrom;
        this.nightsInDest = nightsInDest;
        this.kiwiCountryTo = kiwiCountryTo;
        this.kiwiCountryFrom = kiwiCountryFrom;
        this.baglimit = baglimit;
        this.dTimeUTC = dTimeUTC;
        this.aTimeUTC = aTimeUTC;
        this.dTime = dTime;
        this.aTime = aTime;
        this.distance = distance;
        this.price = price;
        this.route = route;
    }

    public String getMapIdfrom() {
        return mapIdfrom;
    }

    public void setMapIdfrom(String mapIdfrom) {
        this.mapIdfrom = mapIdfrom;
    }

    public String getMapIdTo() {
        return mapIdTo;
    }

    public void setMapIdTo(String mapIdTo) {
        this.mapIdTo = mapIdTo;
    }

    public String getReturnDuration() {
        return returnDuration;
    }

    public void setReturnDuration(String returnDuration) {
        this.returnDuration = returnDuration;
    }

    public String getFlyDuration() {
        return flyDuration;
    }

    public void setFlyDuration(String flyDuration) {
        this.flyDuration = flyDuration;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public Integer getNightsInDest() {
        return nightsInDest;
    }

    public void setNightsInDest(Integer nightsInDest) {
        this.nightsInDest = nightsInDest;
    }

    public KiwiCountry getKiwiCountryTo() {
        return kiwiCountryTo;
    }

    public void setKiwiCountryTo(KiwiCountry kiwiCountryTo) {
        this.kiwiCountryTo = kiwiCountryTo;
    }

    public KiwiCountry getKiwiCountryFrom() {
        return kiwiCountryFrom;
    }

    public void setKiwiCountryFrom(KiwiCountry kiwiCountryFrom) {
        this.kiwiCountryFrom = kiwiCountryFrom;
    }

    public KiwiBagLimit getBaglimit() {
        return baglimit;
    }

    public void setBaglimit(KiwiBagLimit baglimit) {
        this.baglimit = baglimit;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<KiwiFlight> getRoute() {
        return route;
    }

    public void setRoute(List<KiwiFlight> route) {
        this.route = route;
    }

}
