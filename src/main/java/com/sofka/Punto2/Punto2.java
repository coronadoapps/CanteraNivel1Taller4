package com.sofka.Punto2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Punto2 {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private int size = 20;

    public void Punto2(){
        Enunciado();
        presioneCualquierTeclaParaContinuar();
        limpiarPantalla();
        numeros = arregloAleatorio(numeros, size);
        mostrarParesImpares(numeros, size);  
        presioneCualquierTeclaParaContinuar();      
    }

    public static void Enunciado(){
        System.out.println("2. Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100; después de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse e imprimir los números pares e impares.");
    }

    public static void solicitarDato(String dato){
        System.out.println("Por favor ingrese " + dato);
    }

    public static ArrayList<Integer> arregloAleatorio(ArrayList<Integer> numeros, int size){
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            numeros.add(r.nextInt((100 - 1) + 1) + 1);            
        }
        System.out.println("Generando números aleatorios...");
        return numeros;
    }

    public static void mostrarParesImpares(ArrayList<Integer> numeros, int size){
        System.out.print("Números pares: ");
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 == 0){
                System.out.print(numeros.get(i) + ", ");
                numeros.remove(i);
            }
        }
        System.out.println("");
        System.out.print("Números impares: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + ", ");
        }
        System.out.println("");
        System.out.println("");
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
