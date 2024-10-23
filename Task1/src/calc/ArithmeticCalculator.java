package calc;

public class ArithmeticCalculator {
    private int a;
   private  int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //    public int calculate(calc.Operation operation) {
//        return operation.getOperation();
//    }

    public void calculate(Operation operation) {
        if(operation == Operation.ADD) {
            System.out.println(a + b);
        } else if (operation == Operation.SUBTRACT) {
            System.out.println(a - b);
        } else if (operation == Operation.MULTIPLY) {
            System.out.println(a * b);
        }
    }
}
