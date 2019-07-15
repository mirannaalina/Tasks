package Tasks;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fresh {

    public static void main(String[] args) {

//citeste din fisier
        try {
            File fl = new File("C:\\Users\\A737860\\Desktop\\New folder\\fresh.txt");
            fl.createNewFile();
            Scanner sc =  new Scanner (fl);
            while( sc.hasNextLine()){
                String date =  sc.nextLine();
                System.out.println(date);
            }

            System.out.println("Path-ul absolut este: " + fl.getAbsolutePath());
            System.out.println("Numele fisierului este : " + fl.getName());

        } catch (IOException e) {
            e.printStackTrace();

        }



//scrie in fisier
        try{
            FileWriter wr = new FileWriter("C:\\Users\\A737860\\Desktop\\New folder\\fresh.txt");
            wr.write("Heyyyyyy");
            wr.close();

        }catch (IOException es){
            es.printStackTrace();
        }

    }

}