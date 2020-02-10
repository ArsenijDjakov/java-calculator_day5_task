public class Expression {

    public Expression() {
    }

    public boolean checkExpression(String input) {
        input = input.trim();

        if (input.equalsIgnoreCase("quit")) {
            return false;
        } else {
            if (parse(input).length < 2) {
                System.out.println("Invalid Input");
            } else {
                Operands operands = new Operands();
                operands.expressionToOperands(input);
            }
            return true;
        }
    }

    public String[] parse(String input) {
        return input.split(" ");
    }
}
