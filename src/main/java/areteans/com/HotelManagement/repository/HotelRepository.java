package areteans.com.HotelManagement.repository;


import areteans.com.HotelManagement.models.Hotel;
import areteans.com.HotelManagement.models.HotelJPA;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Repository
public interface HotelRepository extends JpaRepository<HotelJPA, Long> {

}
