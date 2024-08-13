package com.melizalde_ds.springboot_test.java_api.impl;

import org.springframework.stereotype.Component;

@Component
public class SpanishRedColor implements RedColor{
    @Override
    public String printColor() {
        return "Rojo";
    }
}
