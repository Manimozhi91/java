package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.BookCab;
import com.service.BookCabService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookCabController {

	@Autowired
	BookCabService bookCabService;
	
	@RequestMapping(value = "bookCab",method = RequestMethod.POST)
	public String bookCab(HttpServletRequest req, BookCab bookcab) { 
		String cname = req.getParameter("cname");
		String fromLocation = req.getParameter("destination");
		String toLocation = req.getParameter("source");
		String typeofcab = req.getParameter("typeofcab");
		try {
		Integer numberofseats = Integer.valueOf("9");
		
		bookcab.setSource(fromLocation);
		bookcab.setDestination(toLocation);
		bookcab.setTypeofcab(typeofcab);
		bookcab.setNumberofseats(numberofseats);
		}catch (Exception e){
			System.out.println(e);
		}
		String result = bookCabService.bookCab(bookcab);
		System.out.println(result);
		return "index";
		
	}
}
