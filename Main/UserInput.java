package Main;

import java.util.Scanner;

public class UserInput {
    //Get user input using Scanner class
    Scanner sc = new Scanner(System.in);
    boolean loop = true;

    public void read() {
        //Continously prompt for input
        while (loop) {
            System.out.print(">");
            //Read the line that the user will type
            String input = sc.nextLine();
            //Parse the expression and determine wether to continue prompting or not
            loop = new Expression().checkExpression(input);
        }
        //Free all resources used by Scanner class
        sc.close();
        System.out.println("GoodBye!");
    }
}
