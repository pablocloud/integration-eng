package es.pabloverdugo.integrationengine.flights.domain.external.kiwi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class KiwiBagLimit implements Serializable {

    @JsonProperty(value = "hand_width")
    private Integer handWidth;

    @JsonProperty(value = "hand_length")
    private Integer handLength;

    @JsonProperty(value = "hold_weight")
    private Integer holdWeight;

    @JsonProperty(value = "hand_height")
    private Integer handHeight;

    @JsonProperty(value = "hand_weight")
    private Integer handWeight;

    public KiwiBagLimit() {

    }

    public KiwiBagLimit(Integer handWidth, Integer handLength, Integer holdWeight, Integer handHeight, Integer handWeight) {
        this.handWidth = handWidth;
        this.handLength = handLength;
        this.holdWeight = holdWeight;
        this.handHeight = handHeight;
        this.handWeight = handWeight;
    }

    public Integer getHandWidth() {
        return handWidth;
    }

    public void setHandWidth(Integer handWidth) {
        this.handWidth = handWidth;
    }

    public Integer getHandLength() {
        return handLength;
    }

    public void setHandLength(Integer handLength) {
        this.handLength = handLength;
    }

    public Integer getHoldWeight() {
        return holdWeight;
    }

    public void setHoldWeight(Integer holdWeight) {
        this.holdWeight = holdWeight;
    }

    public Integer getHandHeight() {
        return handHeight;
    }

    public void setHandHeight(Integer handHeight) {
        this.handHeight = handHeight;
    }

    public Integer getHandWeight() {
        return handWeight;
    }

    public void setHandWeight(Integer handWeight) {
        this.handWeight = handWeight;
    }

}
