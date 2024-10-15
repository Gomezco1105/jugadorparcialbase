package futbol.service;

import futbol.model.Jugador;
import java.util.List;

public interface JugadorService {
    void agregarJugador(Jugador jugador);
    Jugador obtenerJugador(int id);
    List<Jugador> obtenerTodos();
    void actualizarJugador(Jugador jugador);
    void eliminarJugador(int id);
}
