package com.saraya.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.saraya.books.BookInfo;
import com.saraya.books.BookManager;

@Controller
@SessionAttributes("titre")
public class ListController {
	@Autowired
	BookManager bookmanager;
	
	
	@GetMapping(path="/")
	public String showBooks(ModelMap model) {
		model.addAttribute("books", bookmanager.getBooklist());
		return "librairie";
	}
	
	@GetMapping(path="/addForm")
	public String showBooks() {
		return "addForm";
	}
	
	@PostMapping(path="/")
	public String addBook(@RequestParam String title,@RequestParam String isbn,@RequestParam String auteur) {
		
		bookmanager.addtoBooklist(new BookInfo(title,isbn,auteur));
		return "redirect:/";
	}
	@GetMapping(path="/droplist")
	public String removeBook(@RequestParam String title) {
		bookmanager.removefromBooklist(title);
		return "redirect:/";
	}
	// using servletRequest
//	@GetMapping(path="/updateForm")
//	public String updateForm(HttpServletRequest rq , @RequestParam String title,@RequestParam String isbn,@RequestParam String auteur, ModelMap model) {
//		model.addAttribute("title",title);
//		model.addAttribute("isbn",isbn);
//		model.addAttribute("auteur",auteur);
//		HttpSession session= rq.getSession();
//		session.setAttribute("previoustitle", title);
//		
//		return "/updateForm";
//	}
//	
	// using ModelAndView
	
	@GetMapping(path="/updateForm")
	public ModelAndView updateForm(@RequestParam String title,@RequestParam String isbn,@RequestParam String auteur, ModelMap model) {
		model.addAttribute("title",title);
		model.addAttribute("isbn",isbn);
		model.addAttribute("auteur",auteur);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateForm");
		mv.addObject("previoustitle", title);
		return mv;
	}
	
	
	@PostMapping(path="/update")
	public String updateBook(@RequestParam String previoustitle, @RequestParam String title,@RequestParam String isbn,@RequestParam String auteur) {
		//String titre=title;
		bookmanager.updateList(previoustitle,title, isbn, auteur);
		return "redirect:/";
	}
	// update Controller
}
