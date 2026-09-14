package strategy;
// Interfaz Strategy
// Define el método que todas las estrategias concretas deberán implementar.
public interface Strategy {

    // Ejecuta una operación utilizando dos números.
    double ejecutar(double a, double b);
}
