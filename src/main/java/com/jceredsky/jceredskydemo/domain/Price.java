package com.jceredsky.jceredskydemo.domain;

public class Price {

    public Price() {
    }

    String value;
    String currency_code;

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
