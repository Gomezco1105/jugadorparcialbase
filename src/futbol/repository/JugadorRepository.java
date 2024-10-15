package futbol.repository;

import futbol.model.Jugador;
import java.util.List;

public interface JugadorRepository {
    void agregarJugador(Jugador jugador);
    Jugador obtenerJugador(int id);
    List<Jugador> obtenerTodos();
    void actualizarJugador(Jugador jugador);
    void eliminarJugador(int id);
}
