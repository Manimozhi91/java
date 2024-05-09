package com.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.entity.BookCab;
import com.repository.BookCabRepository;

@Repository
public class BookCabService {

	@Autowired
	BookCabRepository bookCabRepository;
	//cname,source,destination, typeofcab,numberofseats
	
	@Autowired
	RestTemplate restTemplate;
	
	public String bookCab(BookCab bc) {
		
		String tolocation = bc.getDestination();
		String fromlocation = bc.getSource();
		String typeofcab = bc.getTypeofcab();
		Integer numberofSeats = bc.getNumberofseats();
	
		Double amount = 
restTemplate.getForObject("http://localhost:8282/cabfare/findCabFare/"+tolocation+"/"+fromlocation+"/"+typeofcab+"/"+numberofSeats, Double.class);
//Float amount = 
//restTemplate.getForObject("http://CABFARESERVICE/cabfare/findCabFare/"+tolocation+"/"+fromlocation+"/"+typeofcab+"/"+numberofSeats, Double.class);		
System.out.println(amount);

		if(amount==-1.0) {
			return "No Cab Avaiable as of now, So cab didn't book";
		}else {
			bc.setAmount(amount);
			bc.setBookingtime(LocalDateTime.now());
			bookCabRepository.save(bc);
			return "Your cab fare amount is "+amount;

	}
	}
}