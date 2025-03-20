package com.example.atividaderapida;

import java.lang.Exception;

public class Calculadora {

    public static int realizarDivisao(int num1, int num2) throws InputInvalid{
        if (num1 == 0 || num2 == 0) {
            throw new InputInvalid();
        }
        return num2 / num1;
    }
}
