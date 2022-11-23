package com.tads.ifms.projetoAula.model;

import lombok.Data;

@Data
public class Handling{
    private float sum, num1, num2;

    public var Handling(float sum, num1, num2){
        this.sum = this.num1+this.num2;

    }

    public float getSum(){
        return sum;
    }
    public float getNum1(){
        return num1;
    }
    public float getNum2(){
        return num2;
    }
}