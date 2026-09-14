package observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {

    // Lista que almacena todos los observadores registrados.
    private List<Observador> observadores;

    // Constructor.
    public Sujeto() {
        observadores = new ArrayList<>();
    }

    // Agrega un observador a la lista.
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Elimina un observador de la lista.
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    // Envía el mensaje a todos los observadores registrados.
    public void notificarObservadores(String mensaje) {

        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
