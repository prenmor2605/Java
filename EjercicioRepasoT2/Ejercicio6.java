import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        float kb ;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce cuantos kb:");
        kb = entrada.nextFloat();

        System.out.printf("Tienes %.4f mb", kb/1024);
    }
}
