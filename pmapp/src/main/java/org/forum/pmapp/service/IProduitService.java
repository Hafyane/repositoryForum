package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Produit;
import org.springframework.transaction.annotation.Transactional;


public interface IProduitService 
{
	@Transactional
	public void addProduit(Produit produit);

	@Transactional(readOnly = true)
	public List<Produit> getProduit();

	@Transactional
	public void deleteProduit(Integer id);

	@Transactional(readOnly = true)
	public Produit searchProduit(Integer id);

	@Transactional
	public Produit updateProduit(Produit produit);
}