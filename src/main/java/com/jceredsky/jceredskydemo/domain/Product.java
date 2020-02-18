package com.jceredsky.jceredskydemo.domain;

public class Product {
    private String id;
    private String name;
    private Price price;

    /**
     *  returns the String id of the product
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * takes a new string to be the id of the product
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * returns the name of the product
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * takes a new string to be the name of the product
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the Price object for the product
     * @return
     */
    public Price getPrice() {
        return price;
    }

    /**
     * takes a new Price to be the price of the product
     * @param price
     */
    public void setPrice(Price price) {
        this.price = price;
    }
}
