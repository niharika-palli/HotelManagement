package areteans.com.HotelManagement.Controller;

import areteans.com.HotelManagement.models.BookingJPA;
import areteans.com.HotelManagement.models.HotelJPA;
import areteans.com.HotelManagement.repository.BookingRepository;
import areteans.com.HotelManagement.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(path="book")
public class BookingController {
    private final BookingService bookingService;

    @GetMapping(path="getdata",consumes=MediaType.APPLICATION_JSON_VALUE)
    public BookingJPA getdata(@RequestParam(value="bookingid")Long bookingid){
        return bookingService.getBookingByID(bookingid);
    }


}
