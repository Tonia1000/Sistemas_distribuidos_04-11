package com.tads.ifms.projetoAula.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Sum{
    private Doble num1, num2;

    public Sum(Doble num1, Doble num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    public Doble getNum1(){
        return num1;
    }
    public Doble getNum2(){
        return num2;
    }
}