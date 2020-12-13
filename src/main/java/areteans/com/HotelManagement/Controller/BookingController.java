package areteans.com.HotelManagement.Controller;

import areteans.com.HotelManagement.models.Booking;
import areteans.com.HotelManagement.models.BookingJPA;
import areteans.com.HotelManagement.models.HotelJPA;
import areteans.com.HotelManagement.service.BookingService;
import areteans.com.HotelManagement.service.CommonService;
import areteans.com.HotelManagement.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@RequestMapping(path="book")
public class BookingController {
    // private final BookingService bookingService;
    //private final HotelService hotelService;
    private final CommonService commonService;

    /* @GetMapping(path="getdata",consumes=MediaType.APPLICATION_JSON_VALUE)
     public BookingJPA getdata(@RequestParam(value="bookingid")Long bookingid){
         return bookingService.getBookingByID(bookingid);
     }*/
   /* @PostMapping(path="nested",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Booking createbook(@RequestBody Booking booking){
        return commonService.create(booking);
    }*/

    @PostMapping(path = "nested", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Booking createbook(@RequestBody Booking booking) {
        return commonService.create(booking);
    }

    @CrossOrigin
    @GetMapping(path = "database")
    public List getDataControl(@RequestParam(value = "userid") Long userid) {
        return this.commonService.getData(userid);
    }




   /* @GetMapping(path = "database" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List getDataControl(@RequestParam(value="hotelid")Long hotelid) {
        return this.commonService.getData(hotelid);
    }*/

   /* @PostMapping(path="simple",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> simpleBooking(@RequestBody Map<String,Object>hotelJPA){
        return commonService.simpleBookingJpa(hotelJPA);
    }*/


}
