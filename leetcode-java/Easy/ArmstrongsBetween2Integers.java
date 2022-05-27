public class ArmstrongsBetween2Integers {
    public static void main(String[] args) {
        boolean status = false;
        int count = 0;
        int result = 0;
        int x_copy;
        int x;
        int digit;
        int a = 150;
        int b = 210;
        for( int i=a+1; i<b; i++) {
            count = 0;
            result = 0;
            x = i;
            x_copy = i;
            System.out.println(i+" is the number");
            while (x != 0) {
                x = x / 10;
                count++;
            }
            System.out.println(count+" is count");
            while (x_copy != 0) {
                digit = x_copy % 10;

                System.out.println(digit+" is digit");
                result = (int) (result + Math.pow(digit, count));
                x_copy = x_copy / 10;

            }
            System.out.println(result+" is result");
            if (i == result) System.out.println(i+" is a Armstrong!!!!!!!!!!!");
        }
    };

}



