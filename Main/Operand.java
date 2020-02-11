package Main;

public class Operand {

    private double op1;
    private double op2;
    private char operation;

    public Operand() {
    }

    public String[] parse(String input) {
        return input.split(" ");
    }

    public void expressionToOperands (String input){

        op1 = Double.parseDouble(parse(input)[0]);
        operation = parse(input)[1].charAt(0);
        op2 = Double.parseDouble(parse(input)[2]);

        Operation operation = new Operation();
        operation.arithmetic(op1,op2,this.operation);
    }
}
