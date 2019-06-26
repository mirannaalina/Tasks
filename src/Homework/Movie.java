package Homework;
/*
Create a class that holds information about a Movie
        movie name
        main character name
        year
        genre
        IMDB score (1.00 - 10.00), default 5.00
        cinema ticket price, default 2 (dollars)
        create constructor from all but IMDB score and ticket price
        create getters for all fields
        create setters for IMDB score and ticket price
        add a field that stores how many Movie instances we create in our code (update this field each time a new object is created)
        create a function that decreases the ticket price with a known value
        create a method that increases the year by 1
        test the Movie class:
        create 3 Movies
        print them to the console in a human readable format
        decrease first two movies IMDB score with 2.5
        increase the year for the last movie
        print the total movies counter
        print all movies again
        add all movies to an array named movies
        print all names from the movies array
        get the average IMDB score for the movies array.
        */

public class Movie {

    private static int instances;

    private String name;
    private String nameMainCharacter;
    private int year;
    private String genre;
   public static float score;
    private float price;

    //constructor

    public Movie(String name, String nameMainCharacter, int year , String genre) {
        this.name = name;
        this.nameMainCharacter = nameMainCharacter;
        this.year = year;
        this.genre = genre;
        instances++;  //count movie instances
    }

    //gettere

    public String getName() {
        return name;
    }
    public String getNameMainCharacter(){
        return nameMainCharacter;
    }
    public int getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    public static float getScore(){
        return score;
    }
    public float getPrice(){
        return price;
    }

    //settere score, price

    public void setScore(float score){
        this.score = score;
    }
    public void setPrice( float price){
        this.price = price;
    }

    //method that decreases the tick. price

    public void ticketPrice(){

        if (price>100) {
           int priceDefault =80;
            System.out.println("price is to much, default is "+ priceDefault);
        }
    }

    public void yearIncrease(){
        year++;
        System.out.println(year);
    }

    //counter of instances
    public static int movieInstances() {
        return instances;

    }

    //average score
    public static void averageScore() {
        if (score < 2.5f) {
            System.out.println("average score in our list is" + getScore());
        }
    }


}
