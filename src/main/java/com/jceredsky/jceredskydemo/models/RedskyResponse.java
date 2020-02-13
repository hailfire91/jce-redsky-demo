package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedskyResponse {

    @JsonProperty("product")
    RedskyProduct product;

    public RedskyResponse() {
    }

    public RedskyProduct getProduct() {
        return product;
    }

    public void setProduct(RedskyProduct product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "RedskyResponse{" +
                "product=" + product +
                '}';
    }
}
