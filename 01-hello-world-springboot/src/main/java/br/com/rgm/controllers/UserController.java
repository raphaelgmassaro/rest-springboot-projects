package br.com.rgm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.rgm.models.UserModel;

@RestController
public class UserController {


	@RequestMapping("/user")
	public UserModel user(
			@RequestParam(value = "nome", defaultValue = "") String nome, 
			@RequestParam(value = "idade", defaultValue = "" ) String idade)
	{
		
		return new UserModel(nome, idade);
	}

}
