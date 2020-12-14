import java.util.Scanner;

public class MiddleVal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.println("enter mass lenth");
        n = scan.nextInt();
        int mass[] = new int[n];
        System.out.println("Entr mass elements");
        for (int i = 0 ; i < n ;i++){
            mass[i] = scan.nextInt();
        }
        int massArg = 0;
        for (int i = 0; i < n; i++) {
            massArg = massArg + mass[i];
        }
        int middle = massArg / n;
        System.out.println("Middle ariphmetical: " + middle);
    }
}
