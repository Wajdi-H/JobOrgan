package com.example.demo.Rest;

import java.util.List;

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

import com.example.demo.DAO.Candidature;
import com.example.demo.DAO.Mission;
import com.example.demo.Repository.CandidatureRepository;
import com.example.demo.Repository.MissionRepository;

@RestController
@RequestMapping("/Candidature")
@CrossOrigin("*")
public class CandidatureRest {
	
	@Autowired
	private CandidatureRepository candidatureRepository;
	@Autowired
	private MissionRepository missionRepository;
	
	@PostMapping("/add/{id}") 
	
	public void save(@RequestBody Candidature candidature,@PathVariable long id )
	{
		Mission miss= new Mission();
		miss=missionRepository.getOne(id);
		candidature.setMission(miss);
	candidatureRepository.save(candidature);
	}
	
	@GetMapping("/get")
	public List<Candidature>  getall()
	{
		return candidatureRepository.findAll();
	}
 	@GetMapping("/get/{id}")
	public Candidature findById(@PathVariable Long id)
	{
		return candidatureRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		candidatureRepository.deleteById(id);
	}
	@PutMapping("/edit/{idCandidature}")  // modification

	public void update(@PathVariable Long idCandidature , @RequestBody Candidature candidature)
	
	{
		candidature.setIdCandidature(idCandidature);
		candidatureRepository.save(candidature);
		
	}
}
