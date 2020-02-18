package com.jceredsky.jceredskydemo.domain;

public class Price {

    public Price() {
    }

    String value;
    String currency_code;

    /**
     * returns a string representing the value of the price
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * the new value of the price.
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * returns the string currency code
     * @return
     */
    public String getCurrency_code() {
        return currency_code;
    }

    /**
     * takes a sting that represents the new currency code.
     * @param currency_code
     */
    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
