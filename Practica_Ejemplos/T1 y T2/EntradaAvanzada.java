package Practica_Ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaAvanzada {

    public static void main(String[] args) {
        
        Scanner entrada;
        String nombre;
        int edad;
        float Altura;
        String Direccion;
        String apellido;

        entrada = new Scanner(System.in) ;

        entrada.useLocale(Locale.ENGLISH);

        System.out.println("Dime tu nombre: ");

        nombre = entrada.nextLine();

       
        System.out.printf("Hola, %s ¡encantado de conocerte! \n",nombre);


        System.out.println("Dime tu apellido: ");

        apellido = entrada.nextLine();
        System.out.printf("Hola, %s %s ¡encantado de conocerte! \n",nombre,apellido);

        System.out.print( "Cuantos años tienes:");
        edad = entrada.nextInt();

         System.out.printf("Tienes %d años \n",edad);

        System.out.print( "Cuanto mides: ");
        Altura = entrada.nextFloat();
        

        System.out.printf(Locale.ENGLISH, "Mides %.3f metros. \n", Altura);

        entrada.nextLine();

        System.out.print( "Cual es tu dirección: ");
        Direccion = entrada.nextLine();

        System.out.printf("Vives en la calle %s  \n",Direccion);

    }
}