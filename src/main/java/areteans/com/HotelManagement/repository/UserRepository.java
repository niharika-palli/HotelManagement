package areteans.com.HotelManagement.repository;

import areteans.com.HotelManagement.models.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserJPA,Long> {
    @Query(value="select u.userid from userdetails u where u.userid=:userid",nativeQuery = true)
    Optional<UserJPA>getUserDetails(@Param("userid")Long userid);
}
