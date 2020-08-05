package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.Experiance;
import com.example.demo.DAO.Mission;
import com.example.demo.Repository.ExperianceRepository;
import com.example.demo.Repository.MissionRepository;




@RestController
@RequestMapping("/mission")
@CrossOrigin("*")

public class MissionRest {

	@Autowired
	private MissionRepository  missionRepository ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Mission mission)
	{
		
		missionRepository.save(mission);
	}
	
 	@GetMapping("/{id}")
	public Mission findById(@PathVariable Long id)
	{
		return missionRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		missionRepository.deleteById(id);
	}
	@PutMapping("edit/{idMission}")  // modification

	public void update(@PathVariable Long idMission , @RequestBody Mission mission)
	
	{
		mission.setIdMission(idMission);
		missionRepository.save(mission);
		
	}
}
