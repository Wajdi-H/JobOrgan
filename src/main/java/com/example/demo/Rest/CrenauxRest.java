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

import com.example.demo.DAO.ChercheurJ;
import com.example.demo.DAO.Crenaux;
import com.example.demo.Repository.ChercheurJRepository;
import com.example.demo.Repository.CrenauxRepository;

@RestController
@RequestMapping("/Crenaux")
@CrossOrigin("*")
public class CrenauxRest {

	@Autowired
	private CrenauxRepository crenauxRepository;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Crenaux crenaux)
	{
		
		crenauxRepository.save(crenaux);
	}
	
 	@GetMapping("/{id}")
	public Crenaux findById(@PathVariable Long id)
	{
		return crenauxRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		crenauxRepository.deleteById(id);
	}
	@PutMapping("edit/{idcren}")  // modification

	public void update(@PathVariable Long idcren , @RequestBody Crenaux crenaux)
	
	{
		crenaux.setIdcren(idcren);
		crenauxRepository.save(crenaux);
		
	}
}