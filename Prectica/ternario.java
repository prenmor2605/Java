import java.util.Scanner;

public class ternario {
    
    public static void main(String[] args) {
        
        float numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu numero");
        numero = entrada.nextFloat();

        System.out.print((numero<5)? "Suspenso":"Aprobado");
        
        entrada.close();
    }
}
