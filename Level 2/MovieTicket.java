//4
/*Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
 */

public class MovieTicket {
    String movieName;
    int seatNumber;
    int price;
    boolean isBooked;

    MovieTicket(String movieName, int price){
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket(int seatNumber){
        if(!isBooked){
            this.seatNumber = seatNumber;
            this.isBooked = true;
        }
        else{
            System.out.println("Ticket already booked");
        }     
    }

    public void displayTicket(){
        if(isBooked){
            System.out.println("---Movie Ticket---");
            System.out.println("Movie : " + movieName);
            System.out.println("Seat Number : " + seatNumber);
            System.out.println("Price : " + price);
        }
        else{
            System.out.println("No ticket is booked");
        }        
    }

    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket("RAj", 100);
        MovieTicket m2 = new MovieTicket("RAja", 100);
        m1.displayTicket();
        m1.bookTicket(7);
        m1.displayTicket();
        m2.bookTicket(7);
        m2.displayTicket();
    }
}
