package strategy;
// Estrategia concreta para realizar una multiplicación.
public class MultiplicacionStrategy implements Strategy {

    @Override
    public double ejecutar(double a, double b) {
        return a * b;
    }
}