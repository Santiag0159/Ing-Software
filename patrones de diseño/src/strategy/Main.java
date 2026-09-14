public class Main {

    public static void main(String[] args) {

        // Creamos la calculadora.
        Calculadora calculadora = new Calculadora();

        // Seleccionamos la estrategia de suma.
        calculadora.setStrategy(new SumaStrategy());
        System.out.println("Suma: " + calculadora.calcular(10, 5));

        // Cambiamos la estrategia por resta.
        calculadora.setStrategy(new RestaStrategy());
        System.out.println("Resta: " + calculadora.calcular(10, 5));

        // Cambiamos la estrategia por multiplicación.
        calculadora.setStrategy(new MultiplicacionStrategy());
        System.out.println("Multiplicación: " + calculadora.calcular(10, 5));
    }
}