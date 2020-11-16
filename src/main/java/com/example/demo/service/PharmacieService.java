package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.pharmacie;

public interface PharmacieService {
	pharmacie savePharmacie(pharmacie p);
	pharmacie updatePharmacie(pharmacie p);
	void deletePharmacie(pharmacie p);
	void deletePharmacieById(Long id);
	pharmacie getPharmacie(Long id);
	List<pharmacie> getAllPharmacies();
}
