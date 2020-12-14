import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.println("enter number");
        n = scan.nextInt();

        int value = 1;

        while (n > 0){
            value = value * n;
            n--;
        }

        System.out.println("factorial: " + value);
    }

}
