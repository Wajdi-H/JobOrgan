package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Experiance;

@Repository
public interface ExperianceRepository extends JpaRepository<Experiance, Long> {

}
