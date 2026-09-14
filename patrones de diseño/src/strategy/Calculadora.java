package strategy;
// Contexto que utiliza una estrategia para realizar una operación.
public class Calculadora {

    // Guarda la estrategia que se utilizará.
    private Strategy strategy;

    // Permite establecer o cambiar la estrategia.
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Ejecuta la operación utilizando la estrategia seleccionada.
    public double calcular(double a, double b) {
        return strategy.ejecutar(a, b);
    }
}