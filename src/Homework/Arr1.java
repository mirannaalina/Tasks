package Homework;

/*Create an array that holds the following numbers
        1, 7, 25, 4, 19, 15, 42, 5
        Loop through the array and print all multiples of 5.
        Expected result: 25, 15, 5
        Loop through the array and print first multiple of 5.
        Expected result: 25
        Loop through the array and print last multiple of 5.
        Expected result: 5
        Loop through the array and print all numbers but the multiples of 5.
        Expected result: 1, 7, 4, 19, 42
*/

public class Arr1 {

    public static void main(String[] args) {

        int[] ar = new int[]{1, 7, 25, 4, 19, 42, 5};

        for (int i = 1; i < ar.length; i++) {
            if (ar.length % i == 0) {
                System.out.println(ar);
            }

        }


    }
}
