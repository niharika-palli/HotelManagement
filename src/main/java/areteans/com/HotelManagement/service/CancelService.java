package areteans.com.HotelManagement.service;


import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CancelService {
    private final JdbcTemplate jdbcTemplate;
    public  Map<String, Object> deleteHotel(Long hotelid) {
        return jdbcTemplate.queryForMap("Delete from hotel where hotelid=?",hotelid);
    }

}
