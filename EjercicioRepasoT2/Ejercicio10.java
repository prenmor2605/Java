public class Ejercicio10 {

    public static final float IVA = 0.21f;

    public static void main(String[] args) {
        String line;

        System.out.print("Introduzca la base imposible (precio del articulo sin IVA):");
        line = System.console().readLine();
        Float base = Float.parseFloat(line);

        Float Total = base * IVA;
        System.out.printf("Base imponible\t%.2f\n", base);
        System.out.printf("IVA (21%%)\t%.2f\n",base * IVA);
        System.out.println("----------------------");
        System.out.printf("Total:\t\t%.2f\n",Total + base);



    }
}
