package Homework;

import static Homework.Movie.averageScore;
import static Homework.Movie.movieInstances;

public class MovieTest {

    public static void main(String[] args) {

        Movie m = new Movie("Tih", "Joe", 1996, "drama");
        Movie n = new Movie("Radd", "f", 1990, "drama");
        Movie r = new Movie("Crd", "d", 2000, "romantic");

        System.out.println("numele filmului : " + m.getName() + ", anul crearii : " + m.getYear() + ", genul : " + m.getGenre());
        System.out.println("numele filmului : " + n.getName() + ", anul crearii : " + n.getYear() + ", genul : " + n.getGenre());
        System.out.println("numele filmului : " + r.getName() + ", anul crearii : " + r.getYear() + ", genul : " + r.getGenre());


        m.setScore(2.5f);
        n.setScore(2.5f);

        r.yearIncrease();

        System.out.println(movieInstances());

        System.out.println("all movies : " +m.getName()+" " + n.getName()+ " " + r.getName());

        //store movies in array
      //  String[] movies = new String[3] {m,n,r};

      //  movies[0] = m  (how to put an instance in an array ???



      //  for (int i = 0;  i < movies.length; i++)
      //  System.out.println(movies[i]);


       averageScore();

    }


}
