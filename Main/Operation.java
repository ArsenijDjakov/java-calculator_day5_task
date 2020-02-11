package Main;

public class Operation {


    public Operation() {
    }


    public void arithmetic(double op1, double op2, char operation) {
            switch (operation) {
                case '+':
                    print(addition(op1, op2));
                    break;
                case '-':
                    print(subtraction(op1, op2));
                    break;
                case '*':
                    print(multiplication(op1, op2));
                    break;
                case '/':
                    print(division(op1, op2));
                    break;
                case '^':
                    print(power(op1, op2));
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    public double addition (double op1, double op2){
        return op1 + op2;
    }

    public double subtraction(double op1, double op2){
        return op1 - op2;
    }

    public double multiplication(double op1, double op2){
        return op1 * op2;
    }

    public double division(double op1, double op2){
        return op1 / op2;
    }

    public double power(double op1, double op2){
        return Math.pow(op1, op2);
    }

    public void print(double result){
        System.out.printf("%.2f\n", result);
    }

}
