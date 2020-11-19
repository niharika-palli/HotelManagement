package areteans.com.HotelManagement.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Hotel {
    private Long hotelid;
    private String hotelname;
    private String city;
    private String landmark;
    private int rooms;

}
