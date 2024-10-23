package calc;

public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*");

    private String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
