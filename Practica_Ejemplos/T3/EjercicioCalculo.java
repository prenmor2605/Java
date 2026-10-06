package Practica_Ejemplos.T3;

import java.util.Scanner;

public class EjercicioCalculo {
    public static void main(String[] args) {


        int opcion;
        float lado;
        float base;
        float altura;
        Scanner entrada = new Scanner(System.in);

        System.out.println("--Menu de calculo de áreas--");
        System.out.println("1, Cuadrado");
        System.out.println("2, Rectangulo");
        System.out.println("3, Triangulo");
        System.out.print("\nElige una opción(1-3)");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Introduce el lado del cuadrado");
                lado = entrada.nextFloat();

                System.out.printf("El área del cuadrado es %.2f\n", lado * lado);
            }
         
            case 2 -> {
                
            }
        }

        entrada.close();
    }
    
}
