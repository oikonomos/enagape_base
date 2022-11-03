package net.enagape.base.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.enagape.base.entity.EaUser;
import net.enagape.base.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public Optional<EaUser> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
