package unidad4;

import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Animal {

    private String nombre;
    private LocalDate fecha;

    public Animal(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Animal(String nombre) {
        this(nombre, LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nombre, animal.nombre) && Objects.equals(fecha, animal.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + (LocalDate.now().getYear() - fecha.getYear()) + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }


}
