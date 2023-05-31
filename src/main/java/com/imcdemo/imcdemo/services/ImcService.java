package com.imcdemo.imcdemo.services;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public ImcResponse calculateImc(double weight, double height) {
        double imc =  weight / (height * height);

        String result;

        if (imc < 18.5) {
            result = "Magreza";
        } else if (imc >= 18.5 && imc < 24.9) {
            result = "Normal";
        } else if (imc >= 24.9 && imc < 30) {
            result = "Sobrepeso";
        } else {
            result = "Obesidade";
        }

        return new ImcResponse(weight, height, imc, result);
    }
}
