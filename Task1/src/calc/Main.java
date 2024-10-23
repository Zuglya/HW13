package calc;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calc = new ArithmeticCalculator(10, 5);
        calc.calculate(Operation.ADD);
        calc.calculate(Operation.SUBTRACT);
        calc.calculate(Operation.MULTIPLY);
    }
}