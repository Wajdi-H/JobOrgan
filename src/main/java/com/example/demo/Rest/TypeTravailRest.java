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

import com.example.demo.DAO.ReseauSoc;
import com.example.demo.DAO.TypeTravail;
import com.example.demo.Repository.ReseausocRepository;
import com.example.demo.Repository.TypeTravailRepository;


@RestController
@RequestMapping("/typeTravail")
@CrossOrigin("*")

public class TypeTravailRest {
	
	@Autowired
	private  TypeTravailRepository typeTravailRepository ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody TypeTravail typeTravail)
	{
		
		typeTravailRepository.save(typeTravail);
	}
	
 	@GetMapping("/{id}")
	public TypeTravail findById(@PathVariable Long id)
	{
		return typeTravailRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		typeTravailRepository.deleteById(id);
	}
	@PutMapping("edit/{idtypetravail}")  // modification

	public void update(@PathVariable Long idtypetravail , @RequestBody TypeTravail typeTravail)
	
	{
		typeTravail.setIdtypetravail(idtypetravail);
		typeTravailRepository.save(typeTravail);
		
	}
}