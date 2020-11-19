package areteans.com.HotelManagement.Controller;

import areteans.com.HotelManagement.service.CancelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="delete")
public class CancelController {
    private final CancelService cancelService;
    @DeleteMapping(value = "/{hotelid}")
    public void deletingOfHotel(@PathVariable("hotelid") Long hotelid) {
        cancelService.deleteHotel(hotelid);
    }
}