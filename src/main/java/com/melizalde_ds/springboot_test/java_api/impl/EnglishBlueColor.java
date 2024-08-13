package com.melizalde_ds.springboot_test.java_api.impl;

import org.springframework.stereotype.Component;

@Component
public class EnglishBlueColor implements BlueColor{
    @Override
    public String printColor() {
        return "Blue";
    }
}
