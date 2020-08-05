package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Employe;

@Repository
public interface EmloyeRepository extends JpaRepository<Employe, Long >{

}
