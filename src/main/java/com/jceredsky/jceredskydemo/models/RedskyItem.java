package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedskyItem {

    @JsonProperty("tcin")
    String tcin;
    @JsonProperty("product_description")
    ProductDescription product_description;

    public RedskyItem() {
    }

    public String getTcin() {
        return tcin;
    }

    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    public ProductDescription getProduct_description() {
        return product_description;
    }

    public void setProduct_description(ProductDescription product_description) {
        this.product_description = product_description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "tcin='" + tcin + '\'' +
                ", product_description=" + product_description +
                '}';
    }
}
