public class ProductSumDifference {
    public static void main(String[] args) {
        int n = 234;
        int sum = 0;
        int prod = 1;
        int digit;
        while(n!=0){
            digit = n%10;
            sum = sum + digit;
            prod = prod*digit;
            n = n / 10;
        }
        System.out.println(prod-sum);

    };

}



