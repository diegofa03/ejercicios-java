package unidad3_arrays;

public class Ejercicio05 {

    static int encontrarValorMaximo(int[] v) {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static double mediaVector(int[] v) {
        double media = 0;
        for (int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;
        return media;
    }


    public static void main(String[] args) {

    }
}
