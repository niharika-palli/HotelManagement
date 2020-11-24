package areteans.com.HotelManagement.Controller;

import areteans.com.HotelManagement.models.Booking;
import areteans.com.HotelManagement.service.CommonService;
import areteans.com.HotelManagement.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(path="book")
public class BookingController {
   // private final BookingService bookingService;
    private final HotelService hotelService;
    private final CommonService commonService;

   /* @GetMapping(path="getdata",consumes=MediaType.APPLICATION_JSON_VALUE)
    public BookingJPA getdata(@RequestParam(value="bookingid")Long bookingid){
        return bookingService.getBookingByID(bookingid);
    }*/
    @PostMapping(path="nested",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Booking createbook(@RequestBody Booking booking){
        return commonService.create(booking);
    }

    @GetMapping(path = "database" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List getDataControl(@RequestParam(value="hotelid")Long hotelid) {
        return this.commonService.getData(hotelid);
    }


}
