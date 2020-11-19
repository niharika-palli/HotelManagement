package areteans.com.HotelManagement.Controller;

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
    @GetMapping(path = "db" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List getDataControl(@RequestParam(value="city")String city) {
        return this.hotelService.getData(city);
    }
}


