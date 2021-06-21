package fr.epita.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class MainController {
	
	
	@GetMapping(value = "/hello")
	public String sayHello(Model model) {
		System.out.println("run through controller");
		return "demo2";
	}

}