package com.sofka.Punto4;

import java.util.ArrayList;

public class Punto4 {
    private String[][] matriz = {{"01", "02", "03", "04", "05"}, {"06", "07", "08", "09", "10"}, {"11", "12", "13", "14", "15"}, {"16", "17", "18", "19", "20"}};

    public void Punto4(){
        Enunciado();
        presioneCualquierTeclaParaContinuar();
        limpiarPantalla();
        mostrarArreglo(matriz);
        System.out.println("");
        cambiarArreglo(matriz);
        presioneCualquierTeclaParaContinuar();
    }

    public static void Enunciado(){
        System.out.println("4. Dada la matriz bidimensional quemada en codigo Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual, imprima una nueva matriz bidimensional.");
    }

    public static void mostrarArreglo(String[][] matriz){
        System.out.println("Matriz bidimensional entregada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        } System.out.println("");
    }

    public static void cambiarArreglo(String[][] matriz){
        System.out.println("Nueva matriz bidimensional: ");
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 != 0) {
                for (int j = matriz[0].length - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            } 
            
        } System.out.println("");
    }

    private static void presioneCualquierTeclaParaContinuar() { 
        System.out.println("Presione cualquier tecla para continuar...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
