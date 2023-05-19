package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;

import net.javaguides.sms.repository.JointheclassRepository;

@Controller
public class JointheclassController {
	private JointheclassRepository jp;
	public	JointheclassController(JointheclassRepository jp) {
		super();
		this.jp=jp;
	}
	
}
