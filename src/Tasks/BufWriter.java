package Tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufWriter {

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("C:\\Users\\A737860\\Desktop\\New folder\\movies.txt");

        BufferedWriter buf =  new BufferedWriter(writer);
        buf.write("hey");
        buf.close();
        System.out.println("succ");


        }
    }

