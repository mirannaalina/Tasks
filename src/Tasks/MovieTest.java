package Tasks;

import java.io.*;
import java.util.*;


public class MovieTest {
    public static void main(String[] args) throws Exception {


        File file = new File("C:\\Users\\A737860\\Desktop\\New folder\\movies.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }

        String[] tokens = st.split(",");
        writeFromFileToArray();

       // if ( )

    }

    public static void writeFromFileToArray() {

        try {

            Scanner s = new Scanner(new File("C:\\Users\\A737860\\Desktop\\New folder\\movies.txt"));
            ArrayList<String> list = new ArrayList<>();
            while(s.hasNext()){
                list.add(s.next());
            }
            s.close();


        } catch(Exception e) {
            System.out.println("not workin");
        }

    }

}
