import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[][] allseries = new int[q][];
        int x = 0;
        for(int i=0;i<q;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            allseries[i] = new int[n];
            x = a+(int)(Math.pow(2,0)*b);
            allseries[i][0] = x;
            for(int j=1; j<n; j++){
                x = x +(int)(Math.pow(2,j)*b);
                allseries[i][j] = x;
            }
        }
        for(int k=0;k<q;k++){
            System.out.println(Arrays.toString(allseries[k]).replaceAll("[\\[|\\]|\\,]", ""));
        }

    }
}