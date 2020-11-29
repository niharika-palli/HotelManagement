package areteans.com.HotelManagement.service;

import areteans.com.HotelManagement.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final JdbcTemplate jdbcTemplate;
    public User userDetails(User user)
    {
        return user;
    }
}
