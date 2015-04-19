package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Timesheet;
import org.springframework.stereotype.Repository;

@Repository("TimesheetDAO")
public class TimesheetDAO extends GenericJpaDAO<Timesheet>
{
	public TimesheetDAO() {
		super(Timesheet.class);
	}
}
