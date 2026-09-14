package singleton;

public class Main {
    public static void main(String[] args){
        // Obtenemos la instancia de Singleton.
        Singleton instancia1 = Singleton.obtenerInstancia();

        // Volver a solicitar la instancia
        Singleton instancia2 = Singleton.obtenerInstancia();

        // Ejecutamos un metodo de Singleton
        instancia1.ejecutarSingleton();

        // Comprobamos si ambas instancias son iguales
        System.out.println(
            "Las instancias son iguales: "+(instancia1 == instancia2)
        );
    }
    
}
