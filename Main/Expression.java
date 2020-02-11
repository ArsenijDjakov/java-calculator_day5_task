package Main;

public class Expression {

    public Expression() {
    }

    public boolean checkExpression(String input) {

        input = input.trim();

        Operand operand = new Operand();

        if (input.equalsIgnoreCase("quit")) {
            return false;
        } else {
            if (operand.parse(input).length < 2) {
                System.out.println("Invalid Input");
            } else {
                operand.expressionToOperands(input);
            }
            return true;
        }
    }

}
