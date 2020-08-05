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

import com.example.demo.DAO.Crenaux;
import com.example.demo.DAO.Disponiblite;
import com.example.demo.Repository.CrenauxRepository;
import com.example.demo.Repository.DisponibliteRepository;

@RestController
@RequestMapping("/Dispo")
@CrossOrigin("*")
public class DisponibliteRest {
	
	@Autowired
	private DisponibliteRepository disponibliteRepository;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Disponiblite disponiblite)
	{
		
		disponibliteRepository.save(disponiblite);
	}
	
 	@GetMapping("/{id}")
	public Disponiblite findById(@PathVariable Long id)
	{
		return disponibliteRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		disponibliteRepository.deleteById(id);
	}
	@PutMapping("edit/{iDdispo}")  // modification

	public void update(@PathVariable Long iDdispo , @RequestBody Disponiblite disponiblite)
	
	{
		disponiblite.setIDdispo(iDdispo);
		disponibliteRepository.save(disponiblite);
		
	}
}