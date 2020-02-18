package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedskyProduct {

    @JsonProperty("item")
    RedskyItem redskyItem;

    /**
     * returns a new instance of the object
     */
    public RedskyProduct() {
    }

    /**
     * returns the RedskyItem of the object
     * @return
     */
    public RedskyItem getRedskyItem() {
        return redskyItem;
    }

    /**
     * sets the RedskyItem of the object
     * @param redskyItem
     */
    public void setRedskyItem(RedskyItem redskyItem) {
        this.redskyItem = redskyItem;
    }

    /**
     * returns a string representation of the object
     * @return
     */
    @Override
    public String toString() {
        return "Product{" +
                "item=" + redskyItem +
                '}';
    }
}
