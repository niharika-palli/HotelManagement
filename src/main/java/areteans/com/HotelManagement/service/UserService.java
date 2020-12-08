package areteans.com.HotelManagement.service;

import areteans.com.HotelManagement.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    private final JdbcTemplate jdbcTemplate;
    public User userDetails(User user)
    {
        return user;
    }

    public Map<String, Object> save(Map<String, Object> user) {
        jdbcTemplate.update("insert into userdetails(userid,username,mobilenumber,gender) values(?,?,?,?)",
                Integer.parseInt((String) user.get("userid")),
                user.get("username"),
                user.get("mobilenumber"),
                user.get("gender"));

        return user;
    }

}
