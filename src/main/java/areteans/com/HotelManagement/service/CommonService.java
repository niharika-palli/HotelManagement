package areteans.com.HotelManagement.service;


import areteans.com.HotelManagement.models.Booking;
import areteans.com.HotelManagement.repository.HotelRepository;
//import areteans.com.HotelManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CommonService {
    private final JdbcTemplate jdbcTemplate;
   // private final JdbcTemplate jdbcTemplateforuser;
   // private final JdbcTemplate jdbcTemplateforbooking;
   // private final HotelRepository hotelRepository;
  //  private final UserRepository userRepository;
    public Booking create(Booking booking){
        Map<String,Object> map1=jdbcTemplate.queryForMap("insert into hotel(hotelid,hotelname,city,rooms,landmark)values(?,?,?,?,?)returning hotelid,hotelname,city",
                Long.parseLong(String.valueOf(booking.getHotel().getHotelid())),
                String.valueOf(booking.getHotel().getHotelname()),
                String.valueOf(booking.getHotel().getCity()),
                Long.parseLong(String.valueOf(booking.getHotel().getRooms())),
                String.valueOf(booking.getHotel().getLandmark()));
        Map<String,Object> map2=jdbcTemplate.queryForMap("insert into userdetails(userid,username,mobilenumber,gender)values(?,?,?,?)returing userid",
                Long.parseLong(String.valueOf(booking.getUser().getUserid())),
                String.valueOf(booking.getUser().getUsername()),
                String.valueOf(booking.getUser().getMobilenumber()),
                String.valueOf(booking.getUser().getGender()));

        jdbcTemplate.update("insert into booking(bookingid,bookingstatus,hotelid,hotelname,city,userid)values(?,?,?,?,?,?) ",
                Long.parseLong(String.valueOf(booking.getBookingid())),
                String.valueOf(booking.getBookingstatus()),
                Long.parseLong(String.valueOf(map1.get("hotelid"))),
                String.valueOf(map1.get("hotelname")),
                String.valueOf(map1.get("city")),
                Long.parseLong(String.valueOf(map2.get("userid")))
        );
        return booking;
    }
    public List getData(Long hotelid) {
        List booking = jdbcTemplate.queryForList("select * from booked where hotelid = ?", hotelid);
        return booking;
    }

}
