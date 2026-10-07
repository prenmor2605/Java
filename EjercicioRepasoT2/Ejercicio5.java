import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        float mb ;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce cuantos Mb:");
        mb = entrada.nextFloat();

        System.out.printf("Tienes %.1f kb", mb*1024);
    }
}
