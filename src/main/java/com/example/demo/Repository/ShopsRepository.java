package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Shops;

public interface ShopsRepository extends JpaRepository<Shops,String> {

}
