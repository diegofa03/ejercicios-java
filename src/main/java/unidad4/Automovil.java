package unidad4;

import java.util.Objects;

public class Automovil {

    private String modelo;
    private float capacidadDeposito;
    private float litrosDeposito;
    private float consumo;
    private float Kilometros;
    private float consumoTotal;

    public Automovil(String modelo, float capacidadDeposito, float litrosDeposito, float consumo) {
        this.modelo = modelo;
        this.capacidadDeposito = capacidadDeposito;
        this.litrosDeposito = litrosDeposito;
        this.consumo = consumo;
    }

    public Automovil(String modelo, float capacidadDeposito, float consumo) {
        this.modelo = modelo;
        this.capacidadDeposito = litrosDeposito = capacidadDeposito;
        this.consumo = consumo;
    }

    public float llenarDeposito() {
        float restante = capacidadDeposito - litrosDeposito;
        litrosDeposito = capacidadDeposito;
        return restante;
    }

    public float llenarDeposito(float litros) {
        litrosDeposito += litros;
        if (litrosDeposito > capacidadDeposito) {
            float sobrantes = litrosDeposito - capacidadDeposito;
            litrosDeposito = capacidadDeposito;
            return sobrantes;
        }
        return 0;
    }

    public float desplazar(float kilometros) {
        float litrosNecesarios = kilometros * consumo;
        if (litrosDeposito < litrosNecesarios) {
            return 0;
        }

        litrosDeposito -= litrosNecesarios;
        consumoTotal += litrosNecesarios;
        this.Kilometros += kilometros;
        return litrosNecesarios;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public float getLitrosDeposito() {
        return litrosDeposito;
    }

    public float getConsumo() {
        return consumo;
    }

    public float getKilometros() {
        return Kilometros;
    }

    public float getConsumoTotal() {
        return consumoTotal;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", capacidadDeposito=" + capacidadDeposito +
                ", litrosDeposito=" + litrosDeposito +
                ", consumo=" + consumo +
                ", Kilometros=" + Kilometros +
                ", consumoTotal=" + consumoTotal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Automovil automovil = (Automovil) o;
        return Float.compare(capacidadDeposito, automovil.capacidadDeposito) == 0 && Float.compare(litrosDeposito, automovil.litrosDeposito) == 0 && Float.compare(consumo, automovil.consumo) == 0 && Float.compare(Kilometros, automovil.Kilometros) == 0 && Float.compare(consumoTotal, automovil.consumoTotal) == 0 && Objects.equals(modelo, automovil.modelo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(modelo);
        result = 31 * result + Float.hashCode(capacidadDeposito);
        result = 31 * result + Float.hashCode(litrosDeposito);
        result = 31 * result + Float.hashCode(consumo);
        result = 31 * result + Float.hashCode(Kilometros);
        result = 31 * result + Float.hashCode(consumoTotal);
        return result;
    }


}
