package com.nshumskii.testapp;

import java.io.Serializable;

public class Sample implements Serializable {

    static final long serialVersionUID = 1L;

    private String key;
    private String value;

    public Sample(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
