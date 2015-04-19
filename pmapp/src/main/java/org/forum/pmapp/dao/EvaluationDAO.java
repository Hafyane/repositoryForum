package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Evaluation;
import org.springframework.stereotype.Repository;

@Repository("EvaluationDAO")
public class EvaluationDAO extends GenericJpaDAO<Evaluation> 
{

	public EvaluationDAO() {
		super(Evaluation.class);
	}

}
