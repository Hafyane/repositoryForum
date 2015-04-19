package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Etape;
import org.springframework.transaction.annotation.Transactional;

public interface IEtapeService {
	@Transactional
	public void addEtape(Etape etape);

	@Transactional(readOnly = true)
	public List<Etape> getEtape();

	@Transactional
	public void deleteEtape(Integer id);

	@Transactional(readOnly = true)
	public Etape searchEtape(Integer id);

	@Transactional
	public Etape updateEtape(Etape etape);
}