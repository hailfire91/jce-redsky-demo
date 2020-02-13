package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedskyProduct {

    @JsonProperty("item")
    RedskyItem redskyItem;

    public RedskyProduct() {
    }

    public RedskyItem getRedskyItem() {
        return redskyItem;
    }

    public void setRedskyItem(RedskyItem redskyItem) {
        this.redskyItem = redskyItem;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item=" + redskyItem +
                '}';
    }
}
