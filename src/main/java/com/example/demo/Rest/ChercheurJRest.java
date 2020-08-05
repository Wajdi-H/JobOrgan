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

import com.example.demo.DAO.Categorie;
import com.example.demo.DAO.ChercheurJ;
import com.example.demo.Repository.CategorieRepository;
import com.example.demo.Repository.ChercheurJRepository;

@RestController
@RequestMapping("/chercheurJ")
@CrossOrigin("*")
public class ChercheurJRest {
	
	@Autowired
	private ChercheurJRepository chercheurJRepository;
	
	@PostMapping("add") 
	
	public void save(@RequestBody ChercheurJ chercheurJ)
	{
		
		chercheurJRepository.save(chercheurJ);
	}
	
 	@GetMapping("/{id}")
	public ChercheurJ findById(@PathVariable Long id)
	{
		return chercheurJRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		chercheurJRepository.deleteById(id);
	}
	@PutMapping("edit/{idC}")  // modification

	public void update(@PathVariable Long idC , @RequestBody ChercheurJ chercheurJ)
	
	{
		chercheurJ.setIdC(idC);
		chercheurJRepository.save(chercheurJ);
		
	}
}