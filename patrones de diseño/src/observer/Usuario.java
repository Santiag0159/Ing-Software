package observer;

public class Usuario implements Observador {

    // Nombre del usuario.
    private String nombre;

    // Constructor.
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método definido
    // por la interfaz Observador.
    @Override
    public void actualizar(String mensaje) {
        System.out.println(
            nombre + " recibió la notificación: " + mensaje
        );
    }
}
