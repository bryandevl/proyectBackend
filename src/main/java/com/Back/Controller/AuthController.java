package com.Back.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Back.Service.AuthService;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {
	

	 @Autowired
	    private AuthService authService;

	  // Endpoint para autenticar al usuario
	    @PostMapping("/autenticar")
	    public boolean autenticar(@RequestParam String username, @RequestParam String password) {
	        return authService.autenticar(username, password);
	    }
	}


