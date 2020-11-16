package com.aeropuerto.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aeropuerto.dao.vuelosDAO;


@RestController
@RequestMapping ("vuelos")

public class vuelosrest<vuelosdao, VuelosDao, Vuelos> {
	
	
	 @GetMapping("/listar")	
	 public List<vuelosDAO> listar (){
		 JpaRepository<vuelosDAO, Integer> vuelosDAO;
		return vuelosDAO.findAll();
		 
	
	}
	 

	
	//localhost:8080/vuelos/listado
	
	
	
	
	

}
