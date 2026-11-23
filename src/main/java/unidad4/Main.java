package unidad4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Automovil> automoviles = new ArrayList<>();

        String linea;
        while (!(linea = IO.readln("Automovil: ")).equalsIgnoreCase("fin")) {
            String[] datos = linea.split(" ");
            Automovil a = new Automovil(
                    datos[0],
                    Float.parseFloat(datos[1]),
                    Float.parseFloat(datos[2]),
                    Float.parseFloat(datos[3])
            );
            automoviles.add(a);
        }
        while (!(linea = IO.readln("acción: ")).equalsIgnoreCase("fin")) {
            String[] datos = linea.split(" ");
            if (datos[0].equalsIgnoreCase("desplazar")) {
                for (Automovil a : automoviles) {
                    if (a.getModelo().equals(datos[1])) {
                        float consumido = a.desplazar(Float.parseFloat(datos[2]));
                        if (consumido == 0) {
                            System.out.println("Combustible insuficiente para este desplazamiento");
                        } else {
                            System.out.println(a.getModelo() + " " + a.getLitrosDeposito() + " " + consumido);
                        }
                    }
                }
            } else {
                System.out.println("Error, acción desconocida");
            }
        }
        for (Automovil a : automoviles) {
            System.out.println(a.getModelo() + " " + a.getLitrosDeposito() + " " + a.getKilometros() + " " + a.getConsumoTotal());
        }
    }
}
