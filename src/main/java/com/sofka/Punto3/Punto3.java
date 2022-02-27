package com.sofka.Punto3;

public class Punto3 {
    private int size = 30;

    public void Punto3(){
        Enunciado();
        presioneCualquierTeclaParaContinuar();
        limpiarPantalla();
        for (int i = 2; i <= size; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        presioneCualquierTeclaParaContinuar();
    }

    public static void Enunciado(){
        System.out.println("3. Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.");
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
