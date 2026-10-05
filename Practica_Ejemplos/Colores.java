public class Colores {
    
    public static void main(String[] args) {
        
        System.out.println("\033[30mNegro\033[0m");
        System.out.println("\033[31mRojo\033[0m");
        System.out.println("\033[32mVerde\033[0m");
        System.out.println("\033[33mAmarillo\033[0m");
        System.out.println("\033[34mAzul\033[0m");
        System.out.println("\033[35mMorado\033[0m");
        System.out.println("\033[36mCian\033[0m");
        System.out.println("\033[37mBlanco\033[0m");

        System.out.println("");

        System.out.println("\033[40mColor\033[0m");
        System.out.println("\033[41mColor\033[0m");
        System.out.println("\033[42mColor\033[0m");
        System.out.println("\033[43mColor\033[0m");
        System.out.println("\033[44mColor\033[0m");
        System.out.println("\033[45mColor\033[0m");
        System.out.println("\033[46mColor\033[0m");
        System.out.println("\033[47mColor\033[0m");

        System.out.println("");

        System.out.println("\033[38;5;123;86;219mColor\033[0m");

        System.out.println("");

        System.out.println("\033[1m- Color\033[0m");
        System.out.println("\033[3m- Color\033[0m");
        System.out.println("\033[4m- Color\033[0m");

        System.out.println("");

        System.out.println("\u263A");
        System.out.println("\uD83D\uDC38");
        
        System.out.println("");


        int a = 21;
        int b = 13;
        int resultado = a * b;
    
        System.out.println("El resultado " + resultado + "\n");
        System.out.printf("El resultado de la multiplicacion %d y%d es igual a %d",a,b,resultado);
    }

}
