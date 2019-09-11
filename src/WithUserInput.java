import java.util.Random;
import java.util.Scanner;

/*Pop Quiz!
Write out the following prompt BY HAND. No using IntelliJ.
Please do part 1 first, then move on to part 2.

Part 1:
Write a program that creates an array with five integers.
Then populate it with numbers ranging from 1 to 100.

Print the length of the array,
Then use a for-loop (either regular or enhanced) to print
each item in the array.

-------------------------

Part 2:
Modify the program to populate it with user input, using a loop.
*/
public class WithUserInput {
    public static void main(String[] args) {
        int [] arr = new int[5];
        // use random
        for (int i=0; i<arr.length; i++){
            Random rnd = new Random();
            arr[i] = 1 + rnd.nextInt(100);
        }

        // use scanner
        int[]arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr2.length; i++){
            System.out.println("Enter a number: ");
            arr2[i] = sc.nextInt();
        }

        // print
        System.out.println("Length of arr1 is: " + arr.length);

        for (int i : arr){
            System.out.println( "arr 1: " + i);
        }

        for (int i : arr2){
            System.out.println("arr 2: " + i);
        }

    }
}
