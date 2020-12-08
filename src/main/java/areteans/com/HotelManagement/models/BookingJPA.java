package areteans.com.HotelManagement.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booking")
public class BookingJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingid;
    private Long hotelid;
    private Long userid;
    private String hotelname;
    private String city;
    private String bookingstatus;



}
