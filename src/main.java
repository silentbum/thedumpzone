import java.util.*;
public class main {
    public static void main(String args[]) {

        int userInput = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("What's your favorite number? ");
        userInput = scnr.nextInt();
        System.out.println("Cool, " + userInput + " is my favorite number too!");
    }
}