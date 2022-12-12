package com.tads.ifms.projetoAula.controller;

import com.tads.ifms.projetoAula.exception.NotNumericException;
import com.tads.ifms.projetoAula.model.Mult;
import com.tads.ifms.projetoAula.service.MultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/sum")
public class SumController {

    @Autowired
    private SumService service;

    @GettMapping (value = "/{num1}/{num2}")
    public float Getcalc(@PathVariable String num1, @PathVariable String num2){
        String erro = "503 (BAD_REQUEST)";

        ///if (x.matches("[0-9].") && y.matches("[0-9].")) {
        try {
            Double num1 = Double.parseDouble(num1);
            Double num2 = Double.parseDouble(num2);
            return num1 + num2;
        } catch (Exception e) {
        //} else {
            throw new NotNumericException("Não é permitido letras na conta!");
        }

    }
}