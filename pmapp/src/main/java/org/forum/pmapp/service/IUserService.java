package org.forum.pmapp.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface IUserService {
	@Transactional
	public void addUserService(UserService userService);

	@Transactional(readOnly = true)
	public List<UserService> getUserService();

	@Transactional
	public void deleteUserService(Integer id);

	@Transactional(readOnly = true)
	public UserService searchUserService(Integer id);

	@Transactional
	public UserService updateUserService(UserService userService);

}