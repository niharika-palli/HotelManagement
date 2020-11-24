package areteans.com.HotelManagement.service;


import areteans.com.HotelManagement.models.BookingJPA;
import areteans.com.HotelManagement.models.HotelJPA;
import areteans.com.HotelManagement.repository.BookingRepository;
import areteans.com.HotelManagement.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    public BookingJPA getBookingByID(Long bookingid){
        Optional<BookingJPA> bbo=bookingRepository.findById(bookingid);
        if (bbo.isPresent()){
            return bbo.get();
        }
        return null;
    }


    public BookingJPA savebooking(BookingJPA bookingJPA) {
        return bookingRepository.save(bookingJPA);
    }

}
