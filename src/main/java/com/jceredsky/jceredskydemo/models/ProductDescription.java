package com.jceredsky.jceredskydemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDescription {
    @JsonProperty("title")
    String title;

    /**
     * returns a new construction of the object
     */
    public ProductDescription() {
    }

    /**
     * returns the field title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * sets the title of the object
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * returns a String representation of the object
     * @return
     */
    @Override
    public String toString() {
        return "ProductDescription{" +
                "title='" + title + '\'' +
                '}';
    }
}
