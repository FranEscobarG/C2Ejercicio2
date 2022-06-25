package com.upchiapas.c2ejercicio2;

import com.upchiapas.c2ejercicio2.models.NumeroSuerte;
import com.upchiapas.c2ejercicio2.models.Persona;

public class Main {
    public static void main(String[] args) {
        Persona objPersona = new Persona();
        objPersona.registrarFecha();

        NumeroSuerte calculo=new NumeroSuerte();
        calculo.generarNumeroSuerte(objPersona.getDia(),objPersona.getMes(),objPersona.getYear());
    }
}
