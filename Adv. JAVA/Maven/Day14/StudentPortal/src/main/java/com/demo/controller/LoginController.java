package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.RegisterUser;
import com.demo.beans.User;
import com.demo.dto.RegistrationForm;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService lservice;
	@GetMapping("/")
	public String showLoginForm() {
		return "loginpage";
	}
	@PostMapping("/validateUser")
	public ModelAndView validateUser(HttpSession session,@RequestParam("uname")String uname,@RequestParam("pass") String password) {
		User user=lservice.validateUser(uname,password);
		if(user!=null) {
			session.setAttribute("user",user);
			return new ModelAndView("redirect:/student/showStudent");
		}
		else {
			return new ModelAndView("loginpage","message","Invalid Credentials!");

		}
		
	}
	@GetMapping("/register")
	public String showRegisterForm(Model m) {
		m.addAttribute("register", new RegistrationForm());
		m.addAttribute("availableSkills", Arrays.asList("Java","Spring","Hibernate","SQL","JS"));
		m.addAttribute("city", List.of("Pune","Mumbai","Nagpur","Delhi"));
		return "registerform";
	}
	
	@PostMapping("/registration")
	public String registerUser(@ModelAttribute("registrationForm") @Valid RegistrationForm form,BindingResult br,Model model) throws IOException{
		if(br.hasErrors()) {
			model.addAttribute("availableSkills",Arrays.asList("Java","Spring","Hibernate","SQL","JS"));
			return "registerform";
		}
		MultipartFile photo=form.getPhoto();
		String uploadDir= System.getProperty("catalina.base")+ File.separator+"user-photos";
		File dir=new File(uploadDir);
		if(!dir.exists())
			dir.mkdirs();
		String ext=FilenameUtils.getExtension(photo.getOriginalFilename());
		String saveName = form.getUsername()+"_profile."+ext;
		File dest = new File(dir,saveName);
		
		photo.transferTo(dest);
		RegisterUser user = new RegisterUser();
		user.setUserId(form.getUserId());
		user.setName(form.getName());
		user.setGender(form.getGender());
		user.setDob(form.getDob());
		user.setUsername(form.getUsername());
		user.setPassword(form.getPassword());
		user.setSkills(String.join(",",form.getSkills()));
		user.setPhotoPath(dest.getAbsolutePath());
		lservice.registerUser(user);
		model.addAttribute("user", user);
		return "register-success";
		
		
	}
}
