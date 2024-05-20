package com.service;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Book;
import com.repository.BookCabRepository;

@Service
public class BookCabService {

	@Autowired
BookCabRepository bookCabRepository;	//cname,source,destination, typeofcab,numberofseats
	
	@Autowired
	RestTemplate restTemplate;
	
	public String bookCab(Book bc) {
		System.out.println("BOOkkkkk"+bc.toString());
		String tolocation = bc.getTolocaation();
		System.out.println("TO"+tolocation);
		String fromlocation = bc.getFromlocation();
		System.out.println("FROM"+fromlocation);

		String typeofcab = bc.getTypeofcab();
		System.out.println(typeofcab);

	System.out.println(restTemplate.toString());
//		Double amount = 
//restTemplate.getForObject("http://localhost:8282/cabfare/findCabFare/"+tolocation+"/"+fromlocation+"/"+typeofcab+"/"+numberofseats, Double.class);
Double amount = 

restTemplate.getForObject("http://CABFARESERVICE/cabfare/findCabFare/ " + tolocation + "/" +fromlocation + "/" +typeofcab, Double.class);		
//System.out.println("Amount " +amount);

		if(amount==null) {
			return "No Cab Avaiable as of now, So cab didn't book";
		}else if(amount==-1.0){
			
			return "Amount is 0";
	}
		else {
			bc.setAmount(amount);
			bc.setBookingtime(LocalDateTime.now());
			bookCabRepository.save(bc);
			return "Your cab fare amount is "+amount;
		}
	}



	public void deleteById(Integer bookcabid) {
		bookCabRepository.deleteById(bookcabid);  
		
	}



	public List<Book> findAllBookings() {
		return bookCabRepository.findAll();
	}



	public String storebookings(Book book) {
		bookCabRepository.save(book);
			return "Booking Saved";
		
	}
}