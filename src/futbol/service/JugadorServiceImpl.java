package futbol.service;

import futbol.model.Jugador;
import futbol.repository.JugadorRepository;
import futbol.repository.JugadorRepositoryImpl;

import java.util.List;

public class JugadorServiceImpl implements JugadorService {
    private final JugadorRepository jugadorRepository = new JugadorRepositoryImpl();

    @Override
    public void agregarJugador(Jugador jugador) {
        jugadorRepository.agregarJugador(jugador);
    }

    @Override
    public Jugador obtenerJugador(int id) {
        return jugadorRepository.obtenerJugador(id);
    }

    @Override
    public List<Jugador> obtenerTodos() {
        return jugadorRepository.obtenerTodos();
    }

    @Override
    public void actualizarJugador(Jugador jugador) {
        jugadorRepository.actualizarJugador(jugador);
    }

    @Override
    public void eliminarJugador(int id) {
        jugadorRepository.eliminarJugador(id);
    }
}
