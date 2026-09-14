package observer;

public interface Observador {

    // Método que será llamado cuando el Sujeto
    // tenga una nueva notificación.
    void actualizar(String mensaje);
}
