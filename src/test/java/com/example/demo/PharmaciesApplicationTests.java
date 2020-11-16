package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.pharmacie;
import com.example.demo.repos.PharmacieRepository;

@SpringBootTest
class PharmaciesApplicationTests {
	
	@Autowired
	private PharmacieRepository pharmacieRepository;
	
	@Test
	public void testCreateProduit() {
		pharmacie prod = new pharmacie(null, "Pharmacie vdn","mermoz","Dakar",1);
		pharmacieRepository.save(prod);
	}
	
	@Test
	public void testFindProduit() {
		pharmacie p = pharmacieRepository.findById(1L).get();
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit() {
		pharmacie p = pharmacieRepository.findById(1L).get();
		pharmacieRepository.save(p);
		System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit() {
		pharmacieRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduit() {
		
		List<pharmacie> prods = pharmacieRepository.findAll();
		
		for (pharmacie p:prods)
			System.out.println(p);
		
	}

	

}
