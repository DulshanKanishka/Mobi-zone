package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.SignUp;


public interface SignUpRepository extends JpaRepository<SignUp,String> {

}
