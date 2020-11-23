package areteans.com.HotelManagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="hotel")

public class HotelJPA {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelid;
    private String city;
    private String hotelname;
    private int rooms;
    private String landmark;
}

