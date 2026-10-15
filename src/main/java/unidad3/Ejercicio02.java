package unidad3;

public class Ejercicio02 {
    public static void main(String[] args) {

        String s = IO.readln("Introduce una cadena: ");

        String r = String.valueOf(new StringBuilder(s).reverse());
        System.out.println(r);
    }
}

