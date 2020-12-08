package areteans.com.HotelManagement.Controller;


import areteans.com.HotelManagement.models.User;
import areteans.com.HotelManagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="user")
public class UserController {
    private final UserService userService;
    @PostMapping(path="details",consumes = MediaType.APPLICATION_JSON_VALUE)
    public User details(@RequestBody User user){
        return userService.userDetails(user);
    }

    @CrossOrigin
    @PostMapping(path = "keepuser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> createuser(@RequestBody Map<String, Object> user) {
        return this.userService.save(user);
    }



}
