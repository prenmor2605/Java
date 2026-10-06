package Ejercicios_repaso;

import java.util.Scanner;

public class ejercicioRepasoEdad {

    public static void main(String[] args) {
        
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la edad:");
        edad = entrada.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");            
        }else{
            System.out.println("Eres menor de edad");
        }

    
        


















        entrada.close();

    }
}