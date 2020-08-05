package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Candidature;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long> {

}
