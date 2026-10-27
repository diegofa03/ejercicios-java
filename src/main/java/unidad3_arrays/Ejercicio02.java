package unidad3_arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {
        Random r = new Random();
        int tamaño = r.nextInt(41) + 10;
        int v[] = new int[tamaño];
        for (int i = 0; i < v.length; i++) {
            boolean seRepite = true;
            int valor = 0;
            do {
                valor = r.nextInt(201) - 100;
                seRepite = false;
                for (int j = 0; j < i; j++) {
                    if (valor == v[j]) {
                        seRepite = true;
                    }
                }
            } while (seRepite);
            v[i] = valor;
        }
        System.out.println(Arrays.toString(v));
    }
}
