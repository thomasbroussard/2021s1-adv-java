package fr.epita.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.epita.datamodel.Reviewer;

@Controller
@RequestMapping("/reviewers")
public class ReviewerController {
	
	
	@GetMapping("/form")
	public String navigateToCreateForm(Model model) {
		model.addAttribute("reviewer", new Reviewer());
		return "reviewerForm.html";
	}
	
	@PostMapping(value="/create")
	public String createReviewer(@ModelAttribute Reviewer reviewer) {
		
		System.out.println(reviewer.getName());
		
		return "landingpage";
	}
}