package Tasks;

import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) throws IOException {


        BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\A737860\\Desktop\\New folder\\movies.txt"));

        ArrayList<String> list = new ArrayList<>();

        String line = buf.readLine();

        while (line != null){
            list.add(line);
            line =buf.readLine();
        }

        buf.close();


        //System.out.println(s);


    }
}
