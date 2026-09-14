package strategy;
// Estrategia concreta para realizar una resta.
public class RestaStrategy implements Strategy {

    @Override
    public double ejecutar(double a, double b) {
        return a - b;
    }
}