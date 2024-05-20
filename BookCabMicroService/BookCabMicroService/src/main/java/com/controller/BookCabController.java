package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Book;
import com.service.BookCabService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookCabController {

	@Autowired
	BookCabService bookCabService;
	
	@RequestMapping(value = "bookCab",method = RequestMethod.POST)
	public ModelAndView  books(HttpServletRequest req, Book bookcab) { 
		String cname = req.getParameter("cname");
		String fromlocation = req.getParameter("fromlocation");
		String tolocation = req.getParameter("tolocation");
		String typeofcab = req.getParameter("typeofcab");
		System.out.println(cname);
		System.out.println(fromlocation);

		String result ;
		 result=bookCabService.bookCab(bookcab);
			System.out.println("RESULt"+result.valueOf(result));

		try {
		
		bookcab.setFromlocation(fromlocation);
		bookcab.setTolocaation(tolocation);
		bookcab.setTypeofcab(typeofcab);
		System.out.println("BOOK CAB OBJ"+ bookcab.getFromlocation());
	//	String bookings = bookCabService.storebookings(bookcab);

		}catch (Exception e){
			System.out.println(e);
		}


		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.html");
		mav.addObject("msg", result);
		return mav;
		}
	
	@GetMapping(value="displayAll")
	public ModelAndView getAllBookings() {

		List<Book> listOfBookings = bookCabService.findAllBookings();
		ModelAndView mav = new ModelAndView();
		System.out.println("LiSt of BOOKINGS"+listOfBookings);
		mav.setViewName("display.jsp");
		return mav;
	}

	@RequestMapping(value="welcome",method = RequestMethod.GET)	
	public ModelAndView homePage(Book bookCab) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("HI");
		return mav;
}
}



