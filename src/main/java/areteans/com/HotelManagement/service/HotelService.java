package areteans.com.HotelManagement.service;

import areteans.com.HotelManagement.models.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final JdbcTemplate jdbcTemplate;

    public Map<String, Object> save(Map<String, Object> hotel) {
         jdbcTemplate.update("insert into hotel(hotelid,city,hotelname,rooms,landmark) values(?,?,?,?,?)",
                Integer.parseInt((String) hotel.get("hotelid")),
                hotel.get("city"),
                hotel.get("hotelname"),
                Integer.parseInt((String) hotel.get("rooms")),
                hotel.get("landmark"));

        return hotel;
    }



    public List getData(String city) {
       List hotels = jdbcTemplate.queryForList("select * from hotel where city = ?", city);
       return hotels;
   }

    public Hotel updateHotel(Hotel hotel) {
        jdbcTemplate.update("hotel set hotelname='SfC'where hotelid=?");
        return updateHotel(hotel);
    }
}




