public class HelloArray {

    public static void main(String[] args) {

        String[] Names = {"Ivan", "Alex", "Lizz", "Igor"};


        for (int i = 0; i < Names.length; i++) {
           Names[i] =  " Hello " + Names[i];
        }
        System.out.print("HELLOOOO:");
        for (int i = 0; i < Names.length; i++) {
            System.out.print(Names[i] + ",");
        }

    }

}
