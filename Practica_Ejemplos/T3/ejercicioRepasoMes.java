package Ejercicios_repaso;

import java.util.Scanner;

public class ejercicioRepasoMes {
    
    public static void main(String[] args) {
        
        int mes;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu mes:");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Eres de ENERO");
                break;
            case 2:
                System.out.println("Eres de FEBRERO");
                break;
            case 3:
                System.out.println("Eres de MARZO");
                break;
            case 4:
                System.out.println("Eres de ABRIL");
                break;
            case 5:
                System.out.println("Eres de MAYO");
                break;
            case 6:
                System.out.println("Eres de JUNIO");
                break;
            case 7:
                System.out.println("Eres de JULIO");
                break;
            case 8:
                System.out.println("Eres de AGOSTO");
                break;
            case 9:
                System.out.println("Eres de SEPTIEMBRE");
                break;
            case 10:
                System.out.println("Eres de OCTUBRE");
                break;
            case 11:
                System.out.println("Eres de NOVIEMBRE");
                break;
            case 12:
                System.out.println("Eres de DICIEMBRE");
                break;
            default:
                System.out.println("No existe el mes");
                break;
        }
    }
}
