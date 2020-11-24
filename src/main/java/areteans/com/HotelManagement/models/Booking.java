package areteans.com.HotelManagement.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking {
    private Long bookingid;
    private String bookingstatus;
    private Hotel hotel;
    public Booking(Long bookingid,String bookingstatus){
        this.bookingid=bookingid;
        this.bookingstatus=bookingstatus;
    }
}
