public class NoUserInput {
    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 12;
        ar[1] = 67;
        ar[2] = 14;
        ar[3] = 15;
        ar[4] = 16;

        for (int i=0; i < ar.length; i++){
            System.out.println(ar[i]);
        }

        for (int num : ar){
            System.out.println(num);
        }
    }
}
