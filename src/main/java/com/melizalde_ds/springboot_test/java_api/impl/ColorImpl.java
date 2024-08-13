package com.melizalde_ds.springboot_test.java_api.impl;

import org.springframework.stereotype.Component;

@Component
public class ColorImpl {
    private RedColor redColor;
    private GreenColor greenColor;
    private BlueColor blueColor;

    public ColorImpl(RedColor redColor, GreenColor greenColor, BlueColor blueColor) {
        this.redColor = redColor;
        this.greenColor = greenColor;
        this.blueColor = blueColor;
    }

    public String getColors() {
        return redColor.printColor() + " " + greenColor.printColor() + " " + blueColor.printColor();
    }

}
