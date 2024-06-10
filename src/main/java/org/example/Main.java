package org.example;

import operacionesmatematicas.Calculadora;

import java.nio.file.FileSystemNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hola mundo");
        Calculadora calculadora = new Calculadora();
        System.out.println("La suma es: " + calculadora.sumar(2,1));


    }
}
