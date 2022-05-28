import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        //Main Class&Method for Solution
        //Change the Main to filename for individual solution
        String str = new String("Hello");
        String revstr = "";
        for( int i=0;i<str.length();i++){
            revstr = str.charAt(i)+revstr;;
        }
        System.out.println(revstr);
    }
}
