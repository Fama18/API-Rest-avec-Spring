package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.pharmacie;
import com.example.demo.repos.PharmacieRepository;

@Service
public class PharmacieServiceImpl implements PharmacieService{
	
	@Autowired
	PharmacieRepository pharmacieRepository;

	@Override
	public pharmacie savePharmacie(pharmacie p) {	
		return pharmacieRepository.save(p);
	}

	@Override
	public pharmacie updatePharmacie(pharmacie p) {
		return pharmacieRepository.save(p);
	}

	@Override
	public void deletePharmacie(pharmacie p) {
		pharmacieRepository.delete(p);
		
	}

	@Override
	public void deletePharmacieById(Long id) {
		pharmacieRepository.deleteById(id);
		
	}

	@Override
	public pharmacie getPharmacie(Long id) {
		return pharmacieRepository.findById(id).get();
	}

	@Override
	public List<pharmacie> getAllPharmacies() {
		return pharmacieRepository.findAll();
	}

}
