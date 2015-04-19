package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Technologie;
import org.springframework.stereotype.Service;

@Service("TechnologieService")
public class TechnologieService  implements ITechnologieService 
{

	@Override
	public void addTechnologie(Technologie technologie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Technologie> getTechnologie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTechnologie(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Technologie searchTechnologie(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Technologie updateTechnologie(Technologie technologie) {
		// TODO Auto-generated method stub
		return null;
	}
	
}