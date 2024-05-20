package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer>{

	
//	@Query(value="select cf.amount from CabFare cf "+"where cf.tolocation = ?5 "
//	+" and cf.fromlocation = ?3"
//			+" and cf.typeofcab=?6 ",nativeQuery=true)
//	public Double findCabFare(@Param("tolocation") String tolocation,
//	@Param("tolocation") String fromlocation,
//	@Param("typeofcab") String typeofcab);
//	@Query("select cf.amount from CabFare cf "+"where cf.tolocation = :tolocation"
//	+" and cf.fromlocation = :fromlocation")
	
	@Query("select cf.amount from CabFare cf " + "where cf.tolocation = :tolocation"
	+ " AND " + " cf.fromlocation = :fromlocation" + " AND  " + "cf.typeofcab= :typeofcab")
	//public Double findCabFare(String tolocation, String fromlocation);
	
	//public Double findCabFare(String tolocation,String fromlocation,Integer numberofseats);
	public Double findCabFare(String tolocation,String fromlocation,String typeofcab);


}
	

