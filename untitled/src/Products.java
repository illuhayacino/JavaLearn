import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter product code(1-5)");
        int n = scan.nextInt();
        String product ;
        switch (n){

            case 1: product = "Milk";
                break;
            case 2: product = "Cookies";
                break;
            case 3: product = "Cheese";
                break;
            case 4: product = "Beef";
                break;
            case 5: product = "Sweet";
                break;
            default: product = "no product with this code";
                break;

        }

        System.out.println(product);
    }
}
