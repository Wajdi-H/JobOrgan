package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.TypeTravail;

@Repository
public interface TypeTravailRepository extends JpaRepository<TypeTravail, Long> {

}
