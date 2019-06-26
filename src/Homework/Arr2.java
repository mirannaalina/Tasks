package Homework;
/*
Write a method createArray that receives an integer number and
        if the number is less or equal to 0 it returns an empty array of integers
        if the number is positive it returns an array of number values from number to 1
        print the results returned by calling this function for
        number = -5
        number = 0
        number = 7
// Result on the console should be:
        number = -5 ---> []
        number = 0  ---> []
        number = 7  ---> [7, 6, 5, 4, 3, 2, 1]
        Create an array named "first" that holds the following values:
        "We", "are", "coding", "daily".
        Create another array named "second" that holds:

        "to", "become", "better", "developers"
        Create an array named all that will hold the values from both the "first" and the second arrays, maintaining the order.

        Create a function printArray that receives an array as parameter and returns a string of all elements separated by space.

        Print the result obtained by calling printArray(all)

//Expected console result
        We are coding daily to become better developers
        Write a method named range that receives two numbers, number1, number2 and generates an array of all integer values from number1 to number2. Print the arrays for calling the function for:
        number1 = 3, number2 = 9
//Expected console result
        3, 4, 5, 6, 7, 8, 9
        number1 = 7, number2 = -2
//Expected console result
        7, 6, 5, 4, 3, 2, 1, 0, -1, -2
        Write createMirrorArray method that receives an integer number and returns an array as in the following example. Print returned array for createMirrorArray(-5) and createMirrorArray(4)
        System.out.println(createMirrorArray(-5));
// should print: -5 -4 -3 -2 -1 1 2 3 4 5

        System.out.println(createMirrorArray(3));
// should print: -3 -2 -1 1 2 3

*/



public class Arr2 {
    public static void main(String[] args) {

        String[] first = {"we"," are","coding","daily"};
        String[] second = {"to","become","better","developers"};

        String[] all =  new String[first.length +second.length];

        System.out.println(all);
      //  int index = second.length;
      //  for (int i =0; i< second.length;i++){
      //      all[i] = second[i];
      //  }
      //  for (int i = 0; i< first.length;i++){
      //      all[i+index] = first[i];
      //  }


    }

    public static String [] printArrray(String [] as){



        return as;

    }

    public static int createArray() {

       int nr = 5; //-5 ,0 , 7

        if (nr <= 0) {
            Integer[] empt = new Integer[]{};
            System.out.println(empt);
        } else if (nr > 0) {
            while (nr > 0) {
                System.out.println(nr);
                nr--;
            }
        }

        return nr;
    }




}
