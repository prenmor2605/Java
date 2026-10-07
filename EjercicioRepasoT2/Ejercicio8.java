import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int base;
        int altura;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Área de un rectángulo");
        System.out.println("---------------------");
        System.out.println("Introduzca la longitud de la base (cm):");
        base = entrada.nextInt();
        System.out.println("Introduzca la altura (cm):");
        altura = entrada.nextInt();

        System.out.printf("El área de un rectángulo es %d",base * altura / 2);


    }
}