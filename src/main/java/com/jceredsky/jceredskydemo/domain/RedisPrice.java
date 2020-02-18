package com.jceredsky.jceredskydemo.domain;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("products")
public class RedisPrice {

    String id;
    String value;
    String currency_code;

    /**
     * constructor for RedisPrice
     */
    public RedisPrice() {
    }

    /**
     * returns the String id of the redisPrice
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * sets the id field
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * returns the String value of the redisPrice
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * sets the value field
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * returns the String currency_code of the redisPrice
     * @return
     */
    public String getCurrency_code() {
        return currency_code;
    }

    /**
     * sets the currency_code field
     * @param currency_code
     */
    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
