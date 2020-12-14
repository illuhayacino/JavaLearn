import java.util.Scanner;

public class Evens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number");
        int n = scan.nextInt();

        if (n%2 == 0){
            System.out.println("N - even number");
        }
        else {
            System.out.println("N - odd number");
        }

    }


}
