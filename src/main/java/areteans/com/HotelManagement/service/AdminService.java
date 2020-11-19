package areteans.com.HotelManagement.service;


import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final JdbcTemplate jdbcTemplate;

    public Map<String,Object>save(Map<String,Object>admin){
        jdbcTemplate.update("insert into hotel(hotelname,city,rooms,landmark)values(?,?,?,?,?)"),
                admin.get("hotelname"),
                admin.get("city"),
                admin.get(rooms)
    }

}
