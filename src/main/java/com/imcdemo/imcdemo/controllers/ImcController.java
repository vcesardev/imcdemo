package com.imcdemo.imcdemo.controllers;

import com.imcdemo.imcdemo.services.ImcService;
import com.imcdemo.imcdemo.services.ImcResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {

    private final ImcService imcService;

    @Autowired
    public ImcController(ImcService imcService) {
        this.imcService = imcService;
    }

    @GetMapping("/imc")
    @ResponseBody
    public ImcResponse calculateImc(@RequestParam("weight") double weight, @RequestParam("height") double height) {
        return imcService.calculateImc(weight, height);
    }
}
