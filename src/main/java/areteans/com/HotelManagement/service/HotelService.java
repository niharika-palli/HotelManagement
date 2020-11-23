package areteans.com.HotelManagement.service;

import areteans.com.HotelManagement.models.Hotel;
import areteans.com.HotelManagement.models.HotelJPA;
import areteans.com.HotelManagement.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepository hotelRepository;
    private final JdbcTemplate jdbcTemplate;

    public HotelJPA saveHotel(HotelJPA hotelJPA) {
        return hotelRepository.save(hotelJPA);
    }
    public void deletedata(long hotelid){
        hotelRepository.deleteById(hotelid);

    }
    public HotelJPA getHotelByID(Long hotelid){
        Optional<HotelJPA> hho=hotelRepository.findById(hotelid);
        if (hho.isPresent()){
            return hho.get();
        }
        return null;
    }



    public Map<String, Object> save(Map<String, Object> hotel) {
         jdbcTemplate.update("insert into hotel(hotelid,city,hotelname,rooms,landmark) values(?,?,?,?,?)",
                Integer.parseInt((String) hotel.get("hotelid")),
                hotel.get("city"),
                hotel.get("hotelname"),
                Integer.parseInt((String) hotel.get("rooms")),
                hotel.get("landmark"));

        return hotel;
    }



    public List getData(String city) {
       List hotels = jdbcTemplate.queryForList("select * from hotel where city = ?", city);
       return hotels;
   }

    public Hotel updateHotel(Hotel hotel) {
        jdbcTemplate.update("hotel set hotelname='SfC'where hotelid=?");
        return updateHotel(hotel);
    }
}




