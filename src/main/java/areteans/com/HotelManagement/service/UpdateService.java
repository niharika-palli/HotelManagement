package areteans.com.HotelManagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UpdateService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String,Object> updateHotel(Map<String,Object> hotel){
        jdbcTemplate.update("update hotel set city=?,hotelname=?,rooms=?,landmark=? where hotelid=?",
                hotel.get("city"),
                hotel.get("hotelname"),
                Integer.parseInt((String) hotel.get("rooms")),
                hotel.get("landmark"),
                Long.parseLong((String) hotel.get("hotelid")));
        return hotel;
    }
}
