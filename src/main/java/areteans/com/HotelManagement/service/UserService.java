package areteans.com.HotelManagement.service;

import areteans.com.HotelManagement.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User userDetails(User user)
    {
        return user;
    }
}
