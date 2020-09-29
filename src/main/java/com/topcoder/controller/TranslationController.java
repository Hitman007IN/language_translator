package com.topcoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.topcoder.model.Sentences;
import com.topcoder.model.TranslatedOutput;
import com.topcoder.model.UserInput;
import com.topcoder.service.TranslationService;

@Controller
public class TranslationController {
	
	@Autowired
	TranslationService translationService;
	
	@GetMapping("/translate")
	  public String translate(Model model) {
	    model.addAttribute("userInput", new UserInput());
	    return "translation";
	  }
	
	@PostMapping("/translate")
	public String translate(@ModelAttribute UserInput userInput, Model model) {
		
		TranslatedOutput output = translationService.translateInput(userInput);
		
		if(null != output && output.getSentences().size() > 0) {
			
			Sentences sentence = output.getSentences().get(0);
			model.addAttribute("sentence", sentence);
		
		} else {
		
			model.addAttribute("sentence", null);
		}
		
		return "result";
	}
	
}
