package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Student;
import com.demo.beans.User;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService sservice;
	
	@GetMapping("/showStudent")
	public ModelAndView getAllStudents(HttpSession session) {
		User user=(User) session.getAttribute("user");
		if(user!=null && user.getRole().equals("user")) {
			List<Student> plist=sservice.getAllStudents();
			return new ModelAndView("showStudent","plist",plist);
		}
		else {
			return new ModelAndView("loginpage","message","pls provide credentials");
		}
	}
	
	
	@GetMapping("/update/{sid}")
	public ModelAndView editStudent(@PathVariable ("sid") int sid)
	{
		Student s=sservice.getById(sid);
		if(s!=null)
		{
			return new ModelAndView("update","stud",s);
		}
		else 
		{
			return new ModelAndView("redirect:/student/showStudent");
		}
	}
	@PostMapping("/updateStudent")
	public ModelAndView updateStudent(@ModelAttribute Student s)
	{
		System.out.println(s);
		boolean status= sservice.updatestudent(s);
		return new ModelAndView("redirect:"+"/student/showStudent");
	}
	
	@GetMapping("/addstudent")
	public String showstudentform(Model myModel) {
		myModel.addAttribute("s1", new Student());
		return "insertStudent";
	}
	
	@PostMapping("insertStudent")
	public ModelAndView addStudent(@ModelAttribute Student s)
	{
		System.out.println(s);
		boolean status =sservice.addstudent(s);
		return new ModelAndView("redirect:/student/showStudent");
	}
	@GetMapping("delete/{sid}")
	public ModelAndView deleteStudent(@PathVariable int sid) {
		boolean status =sservice.delete(sid);
		return new ModelAndView("redirect:/student/showStudent");
	}
	

}
