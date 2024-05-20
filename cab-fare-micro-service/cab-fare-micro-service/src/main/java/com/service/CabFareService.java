package com.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.CabFare;
import com.repository.CabFareRepository;

@Service
public class CabFareService {

	@Autowired
	CabFareRepository cabFareRepository;
	
	public String storeCarFare(CabFare cb) {
		cabFareRepository.save(cb);
		return "Cab Details stored";
	}
	
	public List<CabFare> findAllCabDetails() {
		return cabFareRepository.findAll();
	}

	public Double findCabFare(String tolocation, String fromlocation,String typeofcab) {
		try {
			System.out.println("fare calculating...");
			System.out.println("Amount in cabfare MS" + cabFareRepository.findCabFare(tolocation, fromlocation, typeofcab));
			return cabFareRepository.findCabFare(tolocation, fromlocation, typeofcab);
		} catch (Exception e) {
			System.out.println(e);
			return -1.0;
		}
	}

}
