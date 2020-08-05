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

import com.example.demo.DAO.Employe;
import com.example.demo.DAO.Entreprise;
import com.example.demo.Repository.EmloyeRepository;
import com.example.demo.Repository.EntrepriseRepository;

@RestController
@RequestMapping("/entreprise")
@CrossOrigin("*")
public class EntrepriseRest {

	@Autowired
	private EntrepriseRepository  entrepriseRepository ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Entreprise entreprise)
	{
		
		entrepriseRepository.save(entreprise);
	}
	
 	@GetMapping("/{id}")
	public Entreprise findById(@PathVariable Long id)
	{
		return entrepriseRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		entrepriseRepository.deleteById(id);
	}
	@PutMapping("edit/{idEntreprise}")  // modification

	public void update(@PathVariable Long idEntreprise , @RequestBody Entreprise entreprise)
	
	{
		entreprise.setIdEntreprise(idEntreprise);
		entrepriseRepository.save(entreprise);
		
	}
}

