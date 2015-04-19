package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Timesheet;
import org.springframework.transaction.annotation.Transactional;

public interface ITimesheetService  
{
	@Transactional
	public void addTimesheet(Timesheet timesheet);

	@Transactional(readOnly = true)
	public List<Timesheet> getTimesheet();

	@Transactional
	public void deleteTimesheet(Integer id);

	@Transactional(readOnly = true)
	public Timesheet searchTimesheet(Integer id);

	@Transactional
	public Timesheet updateTimesheet(Timesheet timesheet);		

}