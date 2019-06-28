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


        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);

        }

        System.out.println("multiples of 5");
        for(int i =0; i<ar.length; i++){
            if (ar[i] % 5 ==0){
                System.out.println(ar[i]);
            }
        }

        System.out.println("first multiple of 5");
        for(int i = 0; i< ar.length;i++){
            if(ar[i] % 5 !=0) {
                System.out.println(ar[i]);
            }
        }

        System.out.println("last multiple of 5");
        for(int i= ar.length -1; i>=0;i--){
            if(ar[i] % 5==0){
                System.out.println(ar[i]);
            }
        }


    }
}
