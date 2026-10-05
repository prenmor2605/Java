package Ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio_Operadores {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un numero del 1 al 100:");
        numero = entrada.nextInt();

        if (numero>=1 && numero<=1000) {
           System.out.println("Esta entre 1 y 100:"); 
        }else{
            System.out.println("No esta entre 1 y 100:"); 
        }
    }
}
