public class Operation {


    public Operation() {
    }


    public void arithmetic(double op1, double op2, char operation) {
            switch (operation) {
                case '+':
                    addition(op1, op2);
                    break;
                case '-':
                    subtraction(op1, op2);
                    break;
                case '*':
                    multiplication(op1, op2);
                    break;
                case '/':
                    division(op1, op2);
                    break;
                case '^':
                   power(op1, op2);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    public void addition (double op1, double op2){
        System.out.printf("%.2f\n", op1 + op2);
    }

    public void subtraction(double op1, double op2){
        System.out.printf("%.2f\n", op1 - op2);
    }

    public void multiplication(double op1, double op2){
        System.out.printf("%.2f\n", op1 - op2);
    }

    public void division(double op1, double op2){
        System.out.printf("%.2f\n", op1 / op2);
    }

    public void power(double op1, double op2){
        System.out.printf("%.2f\n", Math.pow(op1, op2));
    }


}
