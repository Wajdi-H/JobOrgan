package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.ChercheurJ;

@Repository
public interface ChercheurJRepository extends JpaRepository<ChercheurJ, Long> {

}
