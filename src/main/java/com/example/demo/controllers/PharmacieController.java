package com.example.demo.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.pharmacie;
import com.example.demo.service.PharmacieService;


@RestController
public class PharmacieController {
	
	@Autowired
	PharmacieService pharmacieService;
	
	@PostMapping("/showCreate")
	public String ShowCreate() {
		return "createPharmacie";
	}
	
	@PostMapping("/savePharmacie")
	public String savePharmacie(@ModelAttribute("pharmacie") pharmacie pharmacie,
				                  ModelMap modelMap) throws ParseException {
			
			 pharmacie savePharmacie = pharmacieService.savePharmacie(pharmacie);
			 String msg = "pharmacie enregistré avec Id "+savePharmacie.getId();
			 modelMap.addAttribute("msg", msg);
			 return "createPharmacie";
		}
	
	@GetMapping("/ListePharmacies")
	public String listePharmacies(ModelMap modelMap) {
			List<pharmacie> prods = pharmacieService.getAllPharmacies();
			modelMap.addAttribute("pharmacies", prods);
			return "listePharmacies";
	}
	
	@DeleteMapping("/supprimerPharmacie")
	public String supprimerPharmacie( @RequestParam("id") Long id,
									ModelMap modelMap) {
			pharmacieService.deletePharmacieById(id);
			List<pharmacie> prods = pharmacieService.getAllPharmacies();
			modelMap.addAttribute("pharmacies", prods);
			return "listePharmacies";
	}
	
	@PutMapping("/modifierPharmacie")
	public String editerPharmacie( @RequestParam("id") Long id,
									ModelMap modelMap) {
		pharmacie p = pharmacieService.getPharmacie(id);
		modelMap.addAttribute("pharmacie", p);
		return "editerPharmacie";
			
	}
	
	@PutMapping("/updatePharmacie")
	public String updatePharmacie(@ModelAttribute("pharmacie") pharmacie pharmacie,
            					ModelMap modelMap) throws ParseException {
		
	
		 pharmacieService.updatePharmacie(pharmacie);
		 List<pharmacie> prods = pharmacieService.getAllPharmacies();
		 modelMap.addAttribute("pharmacies", prods);
		 return "editerPharmacie";
	}
	

}
