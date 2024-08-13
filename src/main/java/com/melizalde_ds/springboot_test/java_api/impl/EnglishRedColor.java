package com.melizalde_ds.springboot_test.java_api.impl;

import org.springframework.stereotype.Component;


public class EnglishRedColor implements RedColor {
    @Override
    public String printColor() {
        return "Red";
    }

}
