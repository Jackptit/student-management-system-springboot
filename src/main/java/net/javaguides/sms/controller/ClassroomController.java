package net.javaguides.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.sms.entity.*;
import net.javaguides.sms.repository.*;


@Controller

public class ClassroomController {
	private TheclassRepository tcr;
	@Autowired
	private TeacherRepository tr;
	@Autowired
	private JointheclassRepository jcr;
	@Autowired
	private	SubjectRepository sr;
	@Autowired
	private StudentRepository str;
	public	ClassroomController(TheclassRepository tcr,TeacherRepository tr,JointheclassRepository jcr,SubjectRepository sr) {
		super();
		this.tcr=tcr;
		this.tr=tr;
		this.jcr=jcr;
		this.sr=sr;
	}
	@GetMapping("/listclass")
	public String listclass(Model model) {
		model.addAttribute("listclass",tcr.findAll());
		return "listclass";
	}
	@GetMapping("/listclass/liststudent/{id}")
	public String detail(@PathVariable String id ,Model model) {	
		model.addAttribute("teacher",tr.findById(tcr.findById(id).get().getIdteacher()).get());
		model.addAttribute("subject",sr.findById(tcr.findById(id).get().getIdsubject()).get());
		model.addAttribute("liststudent",jcr.findAllByIdClass(id));
		model.addAttribute("stu",str.findAll());
		return "class-detail";
	}
}
