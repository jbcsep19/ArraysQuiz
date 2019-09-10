/*Pop Quiz!
Write out the following prompt BY HAND. No using IntelliJ.
Please do part 1 first, then move on to part 2.

Part 1:
Write a program that creates an array with five integers.
Then populate it with numbers ranging from 1 to 100.

Print the length of the array,
Then use a for-loop (either regular or enhanced) to print each item in the array.

-------------------------

Part 2:
Modify the program to populate it with user input, using a loop.
*/

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        // declare an array with the size of five integers and
        // populate it with different numbers ranging from 1 to 100
            // option 1 - one at a time
            int[] intArr = new int[5];
            intArr[0] = 37;
            intArr[1] = 45;
            intArr[2] = 98;
            intArr[3] = 12;
            intArr[4] = 89;

            // option 2 - all at once
            int [] intArr2 = {37, 45, 98, 12, 89};

        // modify the program together as a class to populate it with user input, using a loop. Go through each of the three options

        Scanner keybd = new Scanner(System.in);
            // option 1 - using a for loop
            for (int i=0; i <intArr.length; i++){
                System.out.println("Enter a number :");
                intArr[i] = keybd.nextInt();
            }

            // option 2 - using a while loop
            int i=0;
            while (i<intArr.length){
                System.out.println("Enter a number: ");
                intArr[i] = keybd.nextInt();
                i++;
            }


            // option 3 - using a do-while loop
            i =0;
            do {
                System.out.println("Enter a number: ");
                intArr[i] = keybd.nextInt();
                i++;
            } while (i<intArr.length);


        // print the length of the array
        System.out.println("The length is " + intArr.length);


            // use a for-loop (either regular or enhanced) to print each item in the array
            // option 1 - regular for-loop
            for (int j=0; j < intArr.length; j++){
                System.out.println("The item in array 1 is " + intArr[j]);
            }

            // option 2 - enhanced for-loop
            // int [] intArr2 = {37, 45, 98, 12, 89};
            for (int item : intArr2){
                System.out.println("The item in array 2 is " + item);
            }


    }
}