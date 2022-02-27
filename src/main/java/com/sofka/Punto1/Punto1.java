package com.sofka.Punto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto1 {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private int size = 5;
    public void Punto1(){
        Enunciado();
        presioneCualquierTeclaParaContinuar();
        limpiarPantalla();
        for (int i = 0; i < size; i++) {
            solicitarDato("el numero en la posicion [" + i + "]: ");
            numeros.add(capturarDatoInt());            
        }
        limpiarPantalla();
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("[" + i + "] = " + numeros.get(i));
        }
        presioneCualquierTeclaParaContinuar();
    }

    public static void Enunciado(){
        System.out.println("1. Crear un vector de tipo Entero con 5 posiciones, llenarlo con información solicitada al usuario. Después de recoger toda la información, se requiere imprimir el índice de cada posición en el arreglo con su valor de la siguiente manera:");
        System.out.println("[0] = 55");
        System.out.println("[1] = 99");
        System.out.println("[2] = 11");
        System.out.println("[3] = 56");
        System.out.println("[4] = 69");
    }

    public static void solicitarDato(String dato){
        System.out.println("Por favor ingrese " + dato);
    }

    private static int capturarDatoInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
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
