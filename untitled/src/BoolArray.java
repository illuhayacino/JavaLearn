public class BoolArray {
    public static void main(String[] args) {

        int[] vall = new int[8];

        for (int i = 0; i < vall.length; i++) {
            vall[i] = (int) Math.round((Math.random() * 1));
        }

        for (int i = 0; i < vall.length; i++) {
            System.out.print(vall[i] + " ");
        }
        boolean[] Boolvall = new boolean[8];

        for (int i = 0; i < vall.length; i++) {
            if (vall[i] == 1) {
                Boolvall[i] = true;
            } else {
                Boolvall[i] = false;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < Boolvall.length; i++) {
            System.out.print(Boolvall[i] + " ");
        }
    }
}

