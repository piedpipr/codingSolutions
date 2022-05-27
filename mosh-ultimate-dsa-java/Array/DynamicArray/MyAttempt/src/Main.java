import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Array numbers = new Array(3);
        numbers.insert(6);
        numbers.insert(8);
        numbers.insert(9);
        numbers.print();
        numbers.insert(1);
        numbers.print();
        numbers.removeAt(2);
        numbers.print();
        System.out.println(numbers.indexOf(2));

    }
}
