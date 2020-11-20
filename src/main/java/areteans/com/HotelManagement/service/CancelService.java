package areteans.com.HotelManagement.service;


import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CancelService {
    private final JdbcTemplate jdbcTemplate;
    public void deleteHotel(Long hotelid){
        jdbcTemplate.update("Delete from hotel where hotelid=?",hotelid);
    }

}
