package Practica_Ejemplos;
public class Entrada{

    public static void main(String[] args){

        String nombre;
        int edad;
        String linea;
        Float Altura;

        System.out.print( "Dime como te llamas:");
        nombre = System.console().readLine();

        System.out.printf("Hola, %s ¡encantado de conocerte! \n",nombre);

        System.out.print( "Cuantos años tienes:");
        linea = System.console().readLine() ;
        edad = Integer.parseInt(linea);

        System.out.printf("Tienes %d años \n",edad);

        System.out.print( "Cuanto mides: ");
        Altura = Float.parseFloat( System.console().readLine() );

        System.out.printf("Mides %.2f cm\n",Altura);
    }
}