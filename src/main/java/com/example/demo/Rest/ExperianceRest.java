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

import com.example.demo.DAO.Entreprise;
import com.example.demo.DAO.Experiance;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Repository.ExperianceRepository;

@RestController
@RequestMapping("/experiance")
@CrossOrigin("*")
public class ExperianceRest {

	@Autowired
	private ExperianceRepository  experianceRepository ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Experiance experiance)
	{
		
		experianceRepository.save(experiance);
	}
	
 	@GetMapping("/{id}")
	public Experiance findById(@PathVariable Long id)
	{
		return experianceRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		experianceRepository.deleteById(id);
	}
	@PutMapping("edit/{idExper}")  // modification

	public void update(@PathVariable Long idExper , @RequestBody Experiance experiance)
	
	{
		experiance.setIdExper(idExper);
		experianceRepository.save(experiance);
		
	}
}

