package areteans.com.HotelManagement.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="booked")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingJPA{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingid;
    private String bookingstatus;
   // private Long userid;
   // private Long hotelid;
  // private String hotelname;
    //private String city;
    private HotelJPA hotelJPA;

}
