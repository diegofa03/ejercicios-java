package unidad3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio03 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(">>([\\p{L}\\d_]+)<<(\\d+(?:,\\d{1,2})?):(\\d+)");
        String linea = IO.readln("> ");
        float total = 0;
        while (!linea.equalsIgnoreCase("comprar")) {
            Matcher m = p.matcher(linea);
            if (m.matches()) {
                String nombre = m.group(1);
                String precio = m.group(2);
                String cantidad = m.group(3);
                System.out.println(nombre + " - " + precio + " - " + cantidad);

            }
            linea = IO.readln("> ");
        }
    }
}
