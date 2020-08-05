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

import com.example.demo.DAO.Candidature;
import com.example.demo.DAO.Categorie;
import com.example.demo.Repository.CandidatureRepository;
import com.example.demo.Repository.CategorieRepository;

@RestController
@RequestMapping("/categorie")
@CrossOrigin("*")
public class CategorieRest {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@PostMapping("add") 
	
	public void save(@RequestBody Categorie categorie)
	{
		
		categorieRepository.save(categorie);
	}
	
 	@GetMapping("/{id}")
	public Categorie findById(@PathVariable Long id)
	{
		return categorieRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		categorieRepository.deleteById(id);
	}
	@PutMapping("edit/{idCateg}")  // modification

	public void update(@PathVariable Long idCateg , @RequestBody Categorie categorie)
	
	{
		categorie.setIdCateg(idCateg);
		categorieRepository.save(categorie);
		
	}
}