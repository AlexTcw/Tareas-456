package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class PrintController {

	@GetMapping("/")
	public String saludo() {
		return "Hola mundo";
	}
	
}
