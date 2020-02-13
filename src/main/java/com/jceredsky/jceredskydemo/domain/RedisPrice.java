package com.jceredsky.jceredskydemo.domain;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("products")
public class RedisPrice {

    String id;
    String value;
    String currency_code;

    public RedisPrice() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
