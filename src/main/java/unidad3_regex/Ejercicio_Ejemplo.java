package unidad3_regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio_Ejemplo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Texto: ");
        String linea = in.readLine();
        System.out.print("Letra: ");
        String regex = String.format("%s\\w*", in.readLine());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(linea);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
