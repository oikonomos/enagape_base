package net.enagape.base.controller;

import java.util.Optional;

import net.enagape.base.entity.EaUser;
import net.enagape.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/index")
	public Optional<EaUser> index() {
		return userService.findByEmail("imbeliever@naver.com");
	}

}
