package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Fournisseur;
import org.springframework.transaction.annotation.Transactional;


public interface IFournisseurService 
{
	
	@Transactional
	public void addFournisseur(Fournisseur fournisseur);

	@Transactional(readOnly = true)
	public List<Fournisseur> getFournisseur();

	@Transactional
	public void deleteFournisseur(Integer id);

	@Transactional(readOnly = true)
	public Fournisseur searchFournisseur(Integer id);

	@Transactional
	public Fournisseur updateFournisseur(Fournisseur fournisseur);
	
}