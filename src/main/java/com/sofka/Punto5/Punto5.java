package com.sofka.Punto5;

import java.util.Scanner;

public class Punto5 {
    private int[][] resultados = new int[10][10];
    private int fila, columna;

    public void Punto5(){
        Enunciado();
        presioneCualquierTeclaParaContinuar();
        limpiarPantalla();
        resultados = mostrarCuadro(resultados);
        presioneCualquierTeclaParaContinuar();
        solicitarDato("la fila");
        fila = capturarDatoInt();
        solicitarDato("la columna");
        columna = capturarDatoInt();
        mostrarResultado(resultados, fila, columna);
    }

    public static void Enunciado(){
        System.out.println("5. Se debe de imprimir el cuadro El usuario deberá insertar la fila y columna de la cual desea ver el resultado, el resultado de cada celda debe estar previamente calculado en una matriz bidimensional la cual cada resultado obedecerá a la fila y columna insertada por el usuario.");
    }

    private static int[][] mostrarCuadro(int[][] resultados){
        String aux = "";
        System.out.println("Se presenta el siguiente cuadro: ");
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[0].length; j++) {
                aux = i == 9 ? "" : " ";
                System.out.print(aux + (j+1) + " x " + (i+1) + " ");
                resultados[i][j] = (i+1) * (j+1);
            } System.out.println("");
        }
        return resultados;
    }
   
    private static void solicitarDato(String dato){
        System.out.println("Por favor ingrese " + dato);
    }

    private static int capturarDatoInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static void mostrarResultado(int[][] resultados, int fila, int columna){
        System.out.println("El resultado para la coordenada [" + fila + ", " + columna + "] = " + resultados[fila][columna]);
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
