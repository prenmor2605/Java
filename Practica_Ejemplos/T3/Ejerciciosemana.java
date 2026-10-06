package Ejercicios_repaso;

import java.util.Scanner;

public class Ejerciciosemana {

    public static void main(String[] args) {
        
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime el dia de la semana (1-7):");
        numero = entrada.nextInt();

        if (numero == 1) {
            System.out.println("Es Lunes");
        }else if (numero == 2) {
            System.out.println("Es Martes");
        }else if (numero == 3) {
            System.out.println("Es Miercoles");
        }else if (numero == 4) {
            System.out.println("Es Jueves");
        }else if (numero == 5) {
            System.out.println("Es Viernes");
        }else if (numero == 6) {
            System.out.println("Es Sábado");
        }else if (numero == 7) {
            System.out.println("Es Domingo");
        }else{
            System.out.println("No hay más dias");
        }

    }
}