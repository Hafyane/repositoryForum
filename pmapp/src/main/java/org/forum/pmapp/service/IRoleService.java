package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Role;
import org.springframework.transaction.annotation.Transactional;


public interface IRoleService 
{
	@Transactional
	public void addRole(Role role);

	@Transactional(readOnly = true)
	public List<Role> getRole();

	@Transactional
	public void deleteRole(Integer id);

	@Transactional(readOnly = true)
	public Role searchRole(Integer id);

	@Transactional
	public Role updateRole(Role role);
}