public class Operands {

    private double op1;
    private double op2;
    private char operation;

    public Operands() {
    }

    public void expressionToOperands (String input){
        Expression expression = new Expression();
        op1 = Double.parseDouble(expression.parse(input)[0]);
        //Arithmetic operation
        operation = expression.parse(input)[1].charAt(0);
        //Operand 2
        op2 = Double.parseDouble(expression.parse(input)[2]);
    }
}
