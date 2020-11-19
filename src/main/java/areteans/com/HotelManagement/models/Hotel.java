package areteans.com.HotelManagement.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Hotel {
    private int hotelID;
    private String hotelname;
    private String city;
    private String landmark;
    private int Rooms;

}
