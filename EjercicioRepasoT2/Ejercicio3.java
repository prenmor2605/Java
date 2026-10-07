
public class Ejercicio3 {

    public static void main(String[] args) {
        
        String linea;

        System.out.print("Introduce el numero de euros:");
        linea = System.console().readLine();
        Double euros = Double.parseDouble(linea);

        System.out.printf("En total son %.3f pesetas", euros * 166,386);
    }
}