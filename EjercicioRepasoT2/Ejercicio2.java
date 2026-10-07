import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int horas;
        int salarioH = 12;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el numero de horas: ");
        horas = entrada.nextInt();

        System.out.printf("El salario semanal es de %s", horas * salarioH);

    }
}
