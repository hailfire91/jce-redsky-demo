package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedskyItem {

    @JsonProperty("tcin")
    String tcin;
    @JsonProperty("product_description")
    ProductDescription product_description;

    /**
     * returns a new instance of the object
     */
    public RedskyItem() {
    }

    /**
     * returns the String tcin of the object
     * @return
     */
    public String getTcin() {
        return tcin;
    }

    /**
     * sets the String tcin of the object
     * @param tcin
     */
    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    /**
     * returns the ProductDescription of the object
     * @return
     */
    public ProductDescription getProduct_description() {
        return product_description;
    }

    /**
     * sets the ProductDescription of the object
     * @param product_description
     */
    public void setProduct_description(ProductDescription product_description) {
        this.product_description = product_description;
    }

    /**
     * returns a String representation of the object.
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "tcin='" + tcin + '\'' +
                ", product_description=" + product_description +
                '}';
    }
}
