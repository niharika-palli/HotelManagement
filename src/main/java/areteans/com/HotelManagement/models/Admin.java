package areteans.com.HotelManagement.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Admin {
    private int userId;
    private String userName;
    private String mobileNumber;
    private String gender;
    private int hotelID;
    private String hotelname;
    private String city;
    private String landmark;
    private int Rooms;


}
