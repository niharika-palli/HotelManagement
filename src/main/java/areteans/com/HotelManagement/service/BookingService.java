package areteans.com.HotelManagement.service;

//import areteans.com.HotelManagement.models.BookingJPA;
import areteans.com.HotelManagement.models.HotelJPA;
//import areteans.com.HotelManagement.repository//.BookingRepository;
import areteans.com.HotelManagement.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingService {
   // private final BookingRepository bookingRepository;
    private final HotelRepository hotelRepository;
  /*  public BookingJPA getBookingByID(Long hotelid){
        Optional<BookingJPA> hho=bookingRepository.findById(hotelid);
            return hho.sethotelname(hotelname);
    }*/
    public HotelJPA getHotelvalues(Long hotelid){
        Optional<HotelJPA> optionalHotelJPA=hotelRepository.findById(hotelid);
        return optionalHotelJPA.orElse(null);
    }
  /*  public BookingJPA createBooking(long hotelid,long userid){
        BookingJPA bookingJPA=new BookingJPA();
        HotelJPA hotelJPA=getHotelvalues(hotelid);
        bookingJPA.setHotelid(hotelid);
        bookingJPA.setHotelname(hotelJPA.getHotelname());
        bookingJPA.setCity(hotelJPA.getCity());
       // bookingJPA.setUserid(userid);

        return bookingRepository.save(bookingJPA);
    }*/

}
