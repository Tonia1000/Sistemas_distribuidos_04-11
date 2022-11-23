package com.tads.ifms.projetoAula.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tads.ifms.projetoAula.model.

@RestController
@RequestMapping(value = "/sum")
public class HandlingController {

    @GettMapping (value = "/{num1}/{num2}")
    public float Getcalc(@PathVariable float num1, @PathVariable float num2){
        String erro = "503 (BAD_REQUEST)";

        if ((!num1.chars().anyMatch(Character::isDigit))||(!num2.chars().anyMatch(Character::isDigit))) {
            throw new InvalidCharacterException("Não é permitido letras na soma!");
        } else {
            Var handling = new Handling(num1+num2);
            return handling.getSum();
        }

    }
}