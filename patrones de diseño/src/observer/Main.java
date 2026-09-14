package observer;

public class Main {

    public static void main(String[] args) {

        // Creamos el sujeto que enviará las notificaciones.
        Sujeto sujeto = new Sujeto();

        // Creamos diferentes usuarios.
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Maria");
        Usuario usuario3 = new Usuario("Pedro");

        // Registramos los usuarios como observadores.
        sujeto.agregarObservador(usuario1);
        sujeto.agregarObservador(usuario2);
        sujeto.agregarObservador(usuario3);

        // El sujeto envía una notificación.
        sujeto.notificarObservadores(
            "Se publicó una nueva noticia."
        );

        // Eliminamos a Pedro de los observadores.
        sujeto.eliminarObservador(usuario3);

        System.out.println("\nDespués de eliminar a Pedro:");

        // Enviamos otra notificación.
        sujeto.notificarObservadores(
            "Hay una nueva actualización disponible."
        );
    }
}
