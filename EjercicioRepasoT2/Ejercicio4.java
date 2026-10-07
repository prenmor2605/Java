public class Ejercicio4 {

        public static void main(String[] args) {
        
        String linea;

        System.out.print("Introduce el numero de pesetas:");
        linea = System.console().readLine();
        Double pesetas = Double.parseDouble(linea);

        System.out.printf("En total son %.3f euros", pesetas / 166,386);
    }
}