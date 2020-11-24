package areteans.com.HotelManagement.repository;

import areteans.com.HotelManagement.models.BookingJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingJPA,Long> {
}
