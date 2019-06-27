package Tasks;

public class TEST_18_11_10 implements MovieUtils {

    String name ;
    int yearOfRelease;
    float ticketPrice;

    public TEST_18_11_10(String name, int yearOfRelease, float ticketPrice){

        this.name = name;
        this.yearOfRelease=yearOfRelease;
        this.ticketPrice= ticketPrice;

    }

    public String getName(){
        return name;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }

    public float getTicketPrice(){
        return ticketPrice;
    }

    public static void main(String[] args) {
        TEST_18_11_10 t = new TEST_18_11_10("Her",1990,3.5f) ;

        System.out.println("Name :" +t.getName() +"\n Year :" +t.getTicketPrice()+"\n Ticket price :" + t.yearOfRelease);

    }

    public void getPrice(){
        System.out.println();
    }

  //  float price = MovieUtils.getPrice();  //price to the object???


}
