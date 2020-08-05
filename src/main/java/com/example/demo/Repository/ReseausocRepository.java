package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.ReseauSoc;

@Repository
public interface ReseausocRepository extends JpaRepository<ReseauSoc, Long> {

}
