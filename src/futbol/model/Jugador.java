
package futbol.model;

import java.io.Serializable;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String posicion;

    public Jugador(int id, String nombre, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
