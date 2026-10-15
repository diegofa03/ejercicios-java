package unidad3;

public class Ejercicio01 {
    public static void main(String[] args) {
        String s = IO.readln("Introduce una cadena: ");
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            switch (c) {
                case 'a', 'A':
                    a++;
                    break;
                case 'e', 'E':
                    e++;
                    break;
                case 'i', 'I':
                    i++;
                    break;
                case 'o', 'O':
                    o++;
                    break;
                case 'u', 'U':
                    u++;
            }
        }
        System.out.println("Número de a: " + a);
        System.out.println("Número de e: " + e);
        System.out.println("Número de i: " + i);
        System.out.println("Número de o: " + o);
        System.out.println("Número de u: " + u);
    }
}
