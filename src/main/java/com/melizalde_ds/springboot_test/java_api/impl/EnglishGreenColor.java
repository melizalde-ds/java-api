package com.melizalde_ds.springboot_test.java_api.impl;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreenColor implements GreenColor{
    @Override
    public String printColor() {
        return "Green";
    }
}
