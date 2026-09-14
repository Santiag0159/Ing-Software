package strategy;
// Estrategia concreta para realizar una suma.
public class SumaStrategy implements Strategy {

    @Override
    public double ejecutar(double a, double b) {
        return a + b;
    }
}