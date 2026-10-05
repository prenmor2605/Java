
import java.util.Scanner;

public class Ternario_Ejercicio {

    public static void main(String[] args) {
        
        float precio ;
        Scanner entrada = new Scanner(System.in);

        System.out.print( " Dame el valor de la compra: ");
        precio = entrada.nextFloat() ;

        if (precio >= 50.0f) {
            System.out.println( " Los gastos de envio son: 0.0$ ");
        }else{
            System.out.println( " Los gastos de envio son: 4.95$ ");
        }

    }
}