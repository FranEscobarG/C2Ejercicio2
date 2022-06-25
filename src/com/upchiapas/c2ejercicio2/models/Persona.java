package com.upchiapas.c2ejercicio2.models;

import java.util.Scanner;

public class Persona {
    int dia;
    int mes;
    int year;

    public Persona() {
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public void registrarFecha(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese su fecha de naciomiento");
        System.out.print("Dia: ");
        dia= entrada.nextInt();
        System.out.print("Mes: ");
        mes= entrada.nextInt();
        System.out.print("Año: ");
        year= entrada.nextInt();
    }
}
