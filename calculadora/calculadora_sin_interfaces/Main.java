package calculadora.calculadora_sin_interfaces;

public class Main {
    public static void main(String[] args) {
        Calculadora2 calc = new Calculadora2();

        System.out.println("Suma: " + calc.calcular(10, 5, 'S'));
        System.out.println("Resta: " + calc.calcular(10, 5, 'R'));
        System.out.println("Multiplicación: " + calc.calcular(10, 5, 'M'));
        System.out.println("División: " + calc.calcular(10, 5, 'D'));
        System.out.println("División: " + calc.calcular(10, 0, 'D'));
    }
}
