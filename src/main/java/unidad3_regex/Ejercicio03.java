package unidad3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio03 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(">>([\\p{L}\\d_]+)<<(\\d+(?:,\\d{1,2})?):(\\d+)");
        String linea = IO.readln("> ");
        float total = 0;
        StringBuilder sb = new StringBuilder("Comprar: \n");
        while (!linea.equalsIgnoreCase("comprar")) {
            Matcher m = p.matcher(linea);
            if (m.matches()) {
                sb.append(m.group(1));
                float precio = Float.parseFloat(m.group(2).replace(",", "."));
                sb.append("(");
                sb.append(m.group(3));
                sb.append("), ");
                total += precio * Integer.parseInt(m.group(3));
            }
            linea = IO.readln("> ");
        }
        sb.append("\nImporte Total:\n");
        sb.append(total);
        System.out.println(sb);
    }
}
