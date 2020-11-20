package areteans.com.HotelManagement.Controller;

import areteans.com.HotelManagement.models.Hotel;
import areteans.com.HotelManagement.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping (path="hotel")
public class HotelController {
    private final HotelService hotelService;

    @PostMapping(path = "insert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> createDetails(@RequestBody Map<String, Object> hotel) {
        return this.hotelService.save(hotel);
    }

    @GetMapping(path = "db" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List getDataControl(@RequestParam(value="city")String city) {
        return this.hotelService.getData(city);
    }

}


