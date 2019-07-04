package Tasks;



import java.io.*;

public class ReadWriteMethods {

    public static void main(String[] args) {

        try {


            writeText();

            readText();
        } catch (Exception e) {
            System.out.println(
                    "not working"
            );
        }


    }


    public static void readText() throws Exception {


        File file = new File("C:\\Users\\A737860\\Desktop\\New folder\\movies.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }

    public static void writeText() throws Exception {

        FileWriter fil = new FileWriter("C:\\Users\\A737860\\Desktop\\New folder\\movies.txt");

        BufferedWriter brr = new BufferedWriter(fil);

        brr.write("Venom, 2018, 10\n" +
                "   Aquaman, 2018, 8\n" +
                "   Mile 22, 2018, 9\n" +
                "   Blade Runner 2049, 2017, 9\n" +
                "   Murder on the Orient Express, 2017, 8\n" +
                "   Baby Driver, 2017, 6\n" +
                "   Deadpool, 2016, 5\n" +
                "   Nocturnal Animals, 2016, 9\n" +
                "   Manchester by the Sea, 2016, 8\n" +
                "   The Invisible Guest, 2016, 7");
        brr.close();


    }


}





