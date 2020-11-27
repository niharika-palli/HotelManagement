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
    private final HotelRepository hotelRepository;
  //  private final UserRepository userRepository;
    public Booking create(Booking booking){
        Map<String,Object> map1=jdbcTemplate.queryForMap("insert into hotel(hotelid,hotelname,city,rooms,landmark)values(?,?,?,?,?)returning hotelid,hotelname,city",
                booking.getHotel().getHotelid(),
                booking.getHotel().getHotelname(),
                booking.getHotel().getCity(),
                booking.getHotel().getRooms(),
                booking.getHotel().getLandmark());
        Map<String,Object>map2=jdbcTemplate.queryForMap("insert into userdetails(userid,username,mobilenumber,gender)values(?,?,?,?)returing userid",
                booking.getUser().getUserId(),
                booking.getUser().getUserName(),
                booking.getUser().getMobileNumber(),
                booking.getUser().getGender());

        jdbcTemplate.update("insert into booked(bookingid,bookingstatus,hotelid,hotelname,city,userid)values(?,?,?,?,?.?) ",
                booking.getBookingid(),
                booking.getBookingstatus(),
                map1.get("hotelid"),
                map1.get("hotelname"),
                map1.get("city"),
                map2.get("userId")
        );
        return booking;
    }
    public List getData(Long hotelid) {
        List booking = jdbcTemplate.queryForList("select * from booked where hotelid = ?", hotelid);
        return booking;
    }

}
