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
import com.example.demo.DAO.preferance;
import com.example.demo.Repository.ReseausocRepository;
import com.example.demo.Repository.perferanceRepository;

@RestController
@RequestMapping("/ressoc")
@CrossOrigin("*")

public class ReseauSocRest {

	@Autowired
	private  ReseausocRepository reseausocRepository ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody ReseauSoc reseauSoc)
	{
		
		reseausocRepository.save(reseauSoc);
	}
	
 	@GetMapping("/{id}")
	public ReseauSoc findById(@PathVariable Long id)
	{
		return reseausocRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		reseausocRepository.deleteById(id);
	}
	@PutMapping("edit/{iDres}")  // modification

	public void update(@PathVariable Long iDres , @RequestBody ReseauSoc reseauSoc)
	
	{
		reseauSoc.setIDres(iDres);
		reseausocRepository.save(reseauSoc);
		
	}
}