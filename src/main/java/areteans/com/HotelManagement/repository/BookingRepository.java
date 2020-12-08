package areteans.com.HotelManagement.repository;

//import areteans.com.HotelManagement.models.BookingJPA;
import areteans.com.HotelManagement.models.BookingJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<BookingJPA,Long> {
    //@Query("select b from booking b where userid=:userid")
    //List<BookingJPA> findby(@Param("userid")Long userid);

}
