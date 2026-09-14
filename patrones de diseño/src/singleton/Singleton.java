package singleton;

public class Singleton {
    //Almacena la unica instancia de la clase.
    private static Singleton instancia;

    //Constructor privado
    private Singleton(){
        System.out.println("Se creo la instancia de Singleton");
    }

    //Permite obtener la unica instancia de Singleton.
    public static Singleton obtenerInstancia(){
        //Si no existe, se crea la instancia.
        if(instancia == null){
            instancia = new Singleton();
        }
        //Devuelve la instancia existente.
        return instancia;
    }
    //Metodo de ejemplo
    public void ejecutarSingleton(){
        System.out.println("El singleton esta funcionando");
    }

}