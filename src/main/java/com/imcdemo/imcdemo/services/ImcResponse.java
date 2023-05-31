package com.imcdemo.imcdemo.services;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ImcResponse {

    @JsonProperty
    private double weight;
    @JsonProperty
    private double height;
    @JsonProperty
    private double imc;
    @JsonProperty
    private String result;

    public ImcResponse(double weight, double height, double imc, String result) {
        this.weight = weight;
        this.height = height;
        this.imc = imc;
        this.result = result;
    }
}
