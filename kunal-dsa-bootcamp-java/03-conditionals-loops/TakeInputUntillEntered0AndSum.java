import java.util.Scanner;

public class Solution {
    public static void main(String[] arg){
        int sum = 0;
        int x = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(x!=0){
            x = scanner.nextInt();
            sum = sum+x;
        }
        System.out.println("sum: "+sum);
    }
}
