package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Profile;
import org.springframework.transaction.annotation.Transactional;

public interface IProfileService 
{
	@Transactional
	public void addProfile(Profile profile);

	@Transactional(readOnly = true)
	public List<Profile> getProfile();

	@Transactional
	public void deleteProfile(Integer id);

	@Transactional(readOnly = true)
	public Profile searchProfile(Integer id);

	@Transactional
	public Profile updateProfile(Profile profile);
}