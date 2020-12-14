public class MasToString {
    public static void main(String[] args) {

        char[] country = {'C','a','n','a','d','a'};
        String Country = new String(country);
        System.out.println("String:" + Country);

        char[] countr = Country.toCharArray();
        System.out.print("Array:" );
        for (int i = 0; i < countr.length; i++) {
            System.out.print(" " + countr[i]);
        }

    }
}
