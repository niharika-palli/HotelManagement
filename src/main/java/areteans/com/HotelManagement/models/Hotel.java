package areteans.com.HotelManagement.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
public class Hotel {
    private Long hotelid;
    private String city;
    private String hotelname;
    private int rooms;
    private String landmark;

    public Hotel(Long hotelid, String city, String hotelname, int rooms, String landmark) {
        this.hotelid = hotelid;
        this.city = city;
        this.hotelname = hotelname;
        this.rooms = rooms;
        this.landmark = landmark;
    }
}
