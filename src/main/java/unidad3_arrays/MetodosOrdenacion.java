package unidad3_arrays;

import java.util.Arrays;

public class MetodosOrdenacion {

    public static void main(String[] args) {
        int[] v = {44, 55, 12, 42, 94, 18, 6, 67};
        System.out.println(Arrays.toString(v));
        // insercionDirecta(v);
        // seleccionDirecta(v);
        intercambioDirecto(v);
        System.out.println(Arrays.toString(v));
    }

    public static void insercionDirecta(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int j = 0;
            while (v[i] > v[j] && j < i) {
                j++;
            }
            if (j < i) {
                int aux = v[i];
                for (int k = i - 1; k >= j; k--) {
                    v[k + 1] = v[k];
                }
                v[j] = aux;
            }
        }
    }

    public static void seleccionDirecta(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[min] > v[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
    }

    public static void intercambioDirecto(int[] v) {
        do {
            for (int i = v.length - 1; i >= 0; i--) {
                if (v[i] > v[i - 1]) {
                    int aux = v[i - 1];
                    v[i - 1] = v[i];
                    v[i] = aux;
                }
            }
        } while (v[0] < v[1]);
    }
}
