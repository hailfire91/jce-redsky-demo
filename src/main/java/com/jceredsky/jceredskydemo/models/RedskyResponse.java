package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedskyResponse {

    @JsonProperty("product")
    RedskyProduct product;

    /**
     * returns a new instance of the object
     */
    public RedskyResponse() {
    }


    /**
     * returns the RedskyProduct of the object
     * @return
     */
    public RedskyProduct getProduct() {
        return product;
    }

    /**
     * gets the RedskyProduct of the object
     * @param product
     */
    public void setProduct(RedskyProduct product) {
        this.product = product;
    }

    /**
     * returns a String representation of the object
     * @return
     */
    @Override
    public String toString() {
        return "RedskyResponse{" +
                "product=" + product +
                '}';
    }
}
