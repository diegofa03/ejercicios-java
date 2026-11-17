package unidad4;

import java.awt.Color;

public class Automovil {
    private Color color;
    private int puertas;
    private String combustible;
    private int potencia;

    public static void main(String[] args) {
        Automovil a = new Automovil();
        a.color = Color.RED;
        a.puertas = 1;
        a.combustible = "12 litros";
        a.potencia = 150;
    }

}
