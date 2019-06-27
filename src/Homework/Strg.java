package Homework;

/*
Create variable of type String. Initialize it with value „Lorem ipsum dolor sit amet, consectetur adipiscing elit”.
        a) Convert it to lower case.

        b) Convert it to upper case.

        c) Replace „o” with „z”.

        d) Check if your variable ends with „elit”.
        Write in a comment on each line that prints to console what result you expect. Launch it and verify the results.
        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println(a == b);

        System.out.println(a.equals(b));

        System.out.println(b == c);

        System.out.println(b.equals(c));
        */
public class Strg {

    public static void main(String[] args) {


        String lor = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
//a
        System.out.println(lor.toLowerCase());
//b
        System.out.println(lor.toUpperCase());
//c

        String replaceString = lor.replace("o","z");
        System.out.println(replaceString);
//d
        if(lor.endsWith("elit")){
            System.out.println("String finish with elit ");
        }

        String a = "abc";
        String b ="d";
        String c = new String("abcd");
        //all false
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(b ==c);
        System.out.println(b.equals(c));



    }

}
