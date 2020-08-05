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

import com.example.demo.DAO.Mission;
import com.example.demo.DAO.preferance;
import com.example.demo.Repository.MissionRepository;
import com.example.demo.Repository.perferanceRepository;

@RestController
@RequestMapping("/preferance")
@CrossOrigin("*")

public class PreferanceRest {

	@Autowired
	private  perferanceRepository prefr ;
	
	@PostMapping("add") 
	
	public void save(@RequestBody preferance preferance)
	{
		
		prefr.save(preferance);
	}
	
 	@GetMapping("/{id}")
	public preferance findById(@PathVariable Long id)
	{
		return prefr.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		prefr.deleteById(id);
	}
	@PutMapping("edit/{idpreferance}")  // modification

	public void update(@PathVariable Long idpreferance , @RequestBody preferance preferance)
	
	{
		preferance.setIdpreferance(idpreferance);
		prefr.save(preferance);
		
	}
}