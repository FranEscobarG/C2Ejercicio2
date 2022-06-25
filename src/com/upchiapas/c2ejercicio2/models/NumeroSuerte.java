package com.upchiapas.c2ejercicio2.models;

public class NumeroSuerte {
    public void generarNumeroSuerte(int dia,int mes,int year){
        int sumaFecha,numSuerte=0;
        sumaFecha= dia + mes + year;

        for(int i=0; i<Integer.toString(sumaFecha).length();i++){
            String num = String.valueOf(Integer.toString(sumaFecha).charAt(i));
            numSuerte+=Integer.parseInt(num);
        }
        mostrarNumeroSuerte(numSuerte);
    }

    public void mostrarNumeroSuerte(int numSuerte){
        System.out.println("\nSu numero de la suerte es: "+ numSuerte);
    }

}
