package lk.ijse.phonebackend.repository;

import lk.ijse.phonebackend.entity.PhoneDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneDetailsRepository extends JpaRepository<PhoneDetails,String> {
}
