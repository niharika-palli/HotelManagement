package areteans.com.HotelManagement.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Booking {
    private Long bookingid;
    private String bookingstatus;
    private Hotel hotel;
    private User user;
    public Booking(Long bookingid,String bookingstatus){
        this.bookingid=bookingid;
        this.bookingstatus=bookingstatus;
    }
}
