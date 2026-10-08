public class Ejercicio9 {
    public static void main(String[] args) {
        String linea;

        System.out.print("Introduce el primer numero: ");
        linea = System.console().readLine();
        Float num1 =Float.parseFloat(linea);

        System.out.print("Introduce el segundo numero: ");
        linea = System.console().readLine();
        Float num2 =Float.parseFloat(linea);

        System.out.printf("x = %.1f \n", num1);
        System.out.printf("y = %.1f\n", num2);
        System.out.printf("x + y = %.1f\n", num1 + num2);
        System.out.printf("x - y = %.1f\n", num1 - num2);
        System.out.printf("x / y = %f\n", num1 / num2);
        System.out.printf("x * y = %.1f\n", num1 * num2);

    }
}
