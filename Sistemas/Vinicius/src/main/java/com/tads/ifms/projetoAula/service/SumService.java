package com.tads.ifms.projetoAula.service;

import com.tads.ifms.projetoAula.exception.NotNumericException;
import com.tads.ifms.projetoAula.model.Mult;
import org.springframework.stereotype.Service;

@Service
public class SumService {
    public Double multiplicar(Sum sum) {
        try {
            return sum.getNum1() * sum.getNum2();
        } catch (Exception exception) {
            throw new NotNumericException("Não é permitido letras na conta!");
        }

    }
}
