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

import com.example.demo.DAO.Disponiblite;
import com.example.demo.DAO.Employe;
import com.example.demo.Repository.DisponibliteRepository;
import com.example.demo.Repository.EmloyeRepository;

@RestController
@RequestMapping("/Employe")
@CrossOrigin("*")
public class EmployeRest {

	@Autowired
	private EmloyeRepository  emloyeRepository ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Employe employe)
	{
		
		emloyeRepository.save(employe);
	}
	
 	@GetMapping("/{id}")
	public Employe findById(@PathVariable Long id)
	{
		return emloyeRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		emloyeRepository.deleteById(id);
	}
	@PutMapping("edit/{idemploye}")  // modification

	public void update(@PathVariable Long idemploye , @RequestBody Employe employe)
	
	{
		employe.setIdemploye(idemploye);
		emloyeRepository.save(employe);
		
	}
}
