package areteans.com.HotelManagement.service;


import areteans.com.HotelManagement.models.Booking;
import areteans.com.HotelManagement.repository.HotelRepository;
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
    public Booking create(Booking booking){
        Map<String,Object> map1=jdbcTemplate.queryForMap("insert into hotel(hotelid,hotelname,city,rooms,landmark)values(?,?,?,?,?)returning hotelid,hotelname,city",
                booking.getHotel().getHotelid(),
                booking.getHotel().getHotelname(),
                booking.getHotel().getCity(),
                booking.getHotel().getRooms(),
                booking.getHotel().getLandmark());

        jdbcTemplate.update("insert into booked(bookingid,bookingstatus,hotelid,hotelname,city)values(?,?,?,?,?) ",
                booking.getBookingid(),
                booking.getBookingstatus(),
                map1.get("hotelid"),
                map1.get("hotelname"),
                map1.get("city")
        );
        return booking;
    }
    public List getData(Long hotelid) {
        List booking = jdbcTemplate.queryForList("select * from booked where hotelid = ?", hotelid);
        return booking;
    }

}
