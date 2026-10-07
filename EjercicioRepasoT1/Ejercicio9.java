public class Ejercicio9 {

    public static void main(String[] args) {
        
        int nuemro = 42;
        float decimal = 123.4567f;

        System.out.println("\033[1mLABORATORIO DE FORMATO\033[0m\n");
        System.out.printf("\033[1mNÚMERO ENTERO:  %d\33[0m\n",nuemro);
        System.out.printf("\033[1mDecimal:\t\t |%d|\33[0m\n",nuemro);
        System.out.printf("\033[1mAlineado a la derecha:\t |%10d|\33[0m\n",nuemro);
        System.out.printf("\033[1mAlineado a la izquierda: |%-10d|\33[0m\n",nuemro);
        System.out.printf("\033[1mCon cero a la izquierda: |%010d|\33[0m\n",nuemro);
        System.out.printf("\033[1mCon signo positivo:\t |%+d|\33[0m\n",nuemro);
        System.out.printf("\033[1mHexadecimal:\t\t |%X|%n\33[0m",nuemro);
        System.out.printf("\033[1mOctal:\t\t\t |%o|%n\33[0m\n",nuemro);

        System.out.printf("\033[1mNÚMERO DECIMAL:  %.4f\33[0m\n",decimal);
        System.out.printf("\033[1mUna cifra decimal:\t\t|%.1f|\33[0m\n",decimal);
        System.out.printf("\033[1mDos cifras decimales:\t\t|%.2f|\33[0m\n",decimal);
        System.out.printf("\033[1mCuatro cifras decimales:\t|%.4f|\33[0m\n",decimal);
        System.out.printf("\033[1mNotación científica:\t\t|%.4fe+02|\33[0m\n",decimal);



    }
}