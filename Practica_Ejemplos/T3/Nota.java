package Practica_Ejemplos.T3;

import java.util.Scanner;

public class Nota {
    
    public static void main(String[] args) {
        
        int nota;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu nota en el examen");
        nota = entrada.nextInt();

        if(nota <= 4) {
            System.out.println("Estas suspenso");
        }
        else if  (nota >= 9) {
            System.out.println("Es un sobresaliente");
        }   
        else if (nota <= 6) {
            System.out.println("Estas aprobado");
        }else{
            System.out.println("Es un notable");
        }           
        
    }
}
