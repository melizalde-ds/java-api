package com.melizalde_ds.springboot_test.java_api.controller;

import com.melizalde_ds.springboot_test.java_api.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
    RedColor redColor;
    GreenColor greenColor;
    BlueColor blueColor;

    public ColorController(RedColor redColor, GreenColor greenColor, BlueColor blueColor) {
        this.redColor = redColor;
        this.greenColor = greenColor;
        this.blueColor = blueColor;
    }

    @GetMapping("/Colors")
    public String getColors() {
        ColorImpl colorImpl = new ColorImpl(redColor, greenColor, blueColor);
        return colorImpl.getColors();
    }


}
