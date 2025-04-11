//4
/*Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, 
and copy constructors to initialize bookings.
 */

public class HotelBooking {
    private String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        guestName = "Pass";
        roomType = "Common Room";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking samePerson){
        this.guestName = samePerson.guestName;
        this.nights = samePerson.nights;
        this.roomType = samePerson.roomType;
    }

    public void setRoomType(String roomType){
        this.roomType  = roomType;
    }

    public void setNights(int nights){
        this.nights  = nights;
    }

    void display(){
        System.out.println("----Booking details----");
        System.out.println("Guest Name : " + guestName);
        System.out.println("Type of the room : " + roomType);
        System.out.println("No of nights : " + nights);
    }
}
class call{
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        h1.display();
        HotelBooking h2 = new HotelBooking("Arjun", "Single share", 3);
        h2.display();
        HotelBooking h3 = new HotelBooking(h2);
        h3.display();
        h3.setRoomType("4 share");
        h3.setNights(9);
        h3.display();
    }
}
