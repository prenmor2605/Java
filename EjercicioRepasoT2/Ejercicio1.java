package EjercicioRepasoT2;

public class Ejercicio1 {

    public static void main(String[] args) {

        String linea;

        System.out.println("Introduce el numero 1:");
        linea = System.console().readLine();
        int num1 = Integer.parseInt(linea);

        System.out.println("Introduce el numero 2:");
        linea = System.console().readLine();
        int num2 = Integer.parseInt(linea);

        System.out.printf("El numero es %s", num1 * num2);
    }
}