package areteans.com.HotelManagement.service;

import areteans.com.HotelManagement.config.PostgresManager;
import areteans.com.HotelManagement.models.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final JdbcTemplate jdbcTemplate;

   public List getData(String city) {
       List hotels = jdbcTemplate.queryForList("select * from hotel where city = ?", city);
       return hotels;
   }
}




