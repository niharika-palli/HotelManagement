package areteans.com.HotelManagement.Controller;


import areteans.com.HotelManagement.models.User;
import areteans.com.HotelManagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="user")
public class UserController {
    private final UserService userService;
    @PostMapping(path="details",consumes = MediaType.APPLICATION_JSON_VALUE)
    public User details(@RequestBody User user){
        return userService.userDetails(user);
    }


}
