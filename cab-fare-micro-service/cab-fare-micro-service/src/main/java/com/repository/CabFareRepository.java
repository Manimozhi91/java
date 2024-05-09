package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Double>{

	
	@Query("select cf.amount from CabFare cf where cf.tolocation = :tolocation and cf.fromlocation = :fromlocation and cf.typeofcab=:typeofcab and cf.numberofseats=:numberofseats ")
	public Double findCabFare(@Param("tolocation") String tolocation,
	@Param("fromlocation") String fromlocation, 
	@Param("typeofcab") String typeofcab, 
	@Param("numberofseats") Integer numberofseats);
	
}
