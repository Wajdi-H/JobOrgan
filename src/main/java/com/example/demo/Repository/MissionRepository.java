package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Mission;

@Repository
public interface MissionRepository  extends JpaRepository<Mission,  Long>{

}
