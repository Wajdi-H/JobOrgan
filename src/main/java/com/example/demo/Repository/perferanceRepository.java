package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.preferance;

@Repository
public interface perferanceRepository extends JpaRepository<preferance, Long> {

}
