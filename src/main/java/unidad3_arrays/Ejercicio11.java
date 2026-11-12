package unidad3_arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] v2 = rotarIzquierda(v, 4);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(v2));

    }


    

    static int[] rotarIzquierda(int[] original, int n) {
        int[] v = Arrays.copyOf(original, original.length);

        return v;
    }
}
