package demo.ceetiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import demo.ceetiz.model.AutoEntreprise;
import demo.ceetiz.model.Sas;
import demo.ceetiz.model.Societe;

@RestController
public class SocieteService {
	
	@Autowired
	private Societe societe;
	private Sas sas ;
	private AutoEntreprise autoEntreprise;
	

}
