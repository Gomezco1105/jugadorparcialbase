package futbol;
import futbol.model.Jugador;
import futbol.service.JugadorService;
import futbol.service.JugadorServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JugadorService jugadorService = new JugadorServiceImpl();

        // Agregar jugadores
        jugadorService.agregarJugador(new Jugador(1, "Lionel Messi", "Delantero"));
        jugadorService.agregarJugador(new Jugador(2, "Cristiano Ronaldo", "Delantero"));
        jugadorService.agregarJugador(new Jugador(3, "Rene Higuita", "Portero"));

        // Obtener todos los jugadores
        List<Jugador> jugadores = jugadorService.obtenerTodos();
        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }

        // Actualizar un jugador
        jugadorService.actualizarJugador(new Jugador(1, "Lionel Messi", "Centrocampista"));

        // Obtener un jugador específico
        Jugador jugador = jugadorService.obtenerJugador(1);
        System.out.println("Jugador actualizado: " + jugador);

        // Eliminar un jugador
        jugadorService.eliminarJugador(2);
        System.out.println("Jugadores después de eliminar:");
        for (Jugador j : jugadorService.obtenerTodos()) {
            System.out.println(j);
        }
    }
}
