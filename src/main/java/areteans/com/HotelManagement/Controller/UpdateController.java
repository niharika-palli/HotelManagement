package areteans.com.HotelManagement.Controller;

import areteans.com.HotelManagement.service.UpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path="change")

public class UpdateController {
    private final UpdateService updateService;

    @PutMapping(path = "u", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> hoteldetails(@RequestBody Map<String, Object> hotel){
        return updateService.updateHotel(hotel);
    }

}
