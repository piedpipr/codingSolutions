import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg) {
        //Main Class&Method for Solution
        //Change the Main to filename for individual solution
        int facto = factorial(3);
        System.out.println("factorial: " + facto);
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
