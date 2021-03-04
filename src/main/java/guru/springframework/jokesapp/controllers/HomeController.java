package guru.springframework.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokesapp.services.JokesGenerator;

@Controller
@RequestMapping(value = {"/",  ""})
public class HomeController {

	JokesGenerator jokesGenerator;
	
	@Autowired
	public HomeController(JokesGenerator jokesGenerator) {
		this.jokesGenerator = jokesGenerator;
	}
	
	@GetMapping
	public String getJoke(Model model) {
		model.addAttribute("joke", jokesGenerator.getJoke());
		return "chucknorris";
	}
	
}
