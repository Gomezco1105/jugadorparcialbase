package futbol.repository;

import futbol.model.Jugador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JugadorRepositoryImpl implements JugadorRepository {
    private final String archivo = "jugadores.dat";

    @Override
    public void agregarJugador(Jugador jugador) {
        List<Jugador> jugadores = obtenerTodos();
        jugadores.add(jugador);
        guardarJugadores(jugadores);
    }

    @Override
    public Jugador obtenerJugador(int id) {
        List<Jugador> jugadores = obtenerTodos();
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == id) {
                return jugador;
            }
        }
        return null;
    }

    @Override
    public List<Jugador> obtenerTodos() {
        List<Jugador> jugadores = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            jugadores = (List<Jugador>) ois.readObject();
        } catch (FileNotFoundException e) {
            // El archivo no existe, retornamos una lista vacía
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return jugadores;
    }

    @Override
    public void actualizarJugador(Jugador jugador) {
        List<Jugador> jugadores = obtenerTodos();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getId() == jugador.getId()) {
                jugadores.set(i, jugador);
                guardarJugadores(jugadores);
                return;
            }
        }
    }

    @Override
    public void eliminarJugador(int id) {
        List<Jugador> jugadores = obtenerTodos();
        jugadores.removeIf(jugador -> jugador.getId() == id);
        guardarJugadores(jugadores);
    }

    private void guardarJugadores(List<Jugador> jugadores) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(jugadores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
