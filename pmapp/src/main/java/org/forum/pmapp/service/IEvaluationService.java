package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Evaluation;
import org.springframework.transaction.annotation.Transactional;


public interface IEvaluationService 
{
	@Transactional
	public void addEvaluation(Evaluation evaluation);

	@Transactional(readOnly = true)
	public List<Evaluation> getEvaluation();

	@Transactional
	public void deleteEvaluation(Integer id);

	@Transactional(readOnly = true)
	public Evaluation searchEvaluation(Integer id);

	@Transactional
	public Evaluation updateEvaluation(Evaluation evaluation);
}