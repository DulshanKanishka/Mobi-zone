package com.example.demo.Repository;

import com.example.demo.Entity.PhoneDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneDetailsRepository extends JpaRepository<PhoneDetails,String> {
}
