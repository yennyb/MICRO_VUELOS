package com.aeropuerto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.aeropuerto.dao.pasajeroDAO;
import com.aeropuerto.dao.vuelosDAO;
import com.aeropuerto.model.pasajero;


@RestController
@RequestMapping ("pasajeros")

public class pasajerorest<pasajerodao, PasajeroDao, Pasajero, PasajeroDAO> {
	 
	private static final Object entity = null;
	@Autowired
	private PasajeroDao pasajeroDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Pasajero pasajero) {
		
		
	}
	 @GetMapping("/listar")	
	 public List<pasajeroDAO> listar(){
		 JpaRepository<pasajeroDAO, Integer> parajeroDAO;
		return parajeroDAO.findAll();
		 
	 }
	 
	 @GetMapping("/listar")	
	 public List<PasajeroDAO> listar1(){
		 JpaRepository<vuelosDAO, Integer> pasajeroDAO;
		return vuelosDAO.listar1pasajeropordocumento();
			 
	 }
	 
	 
	 @DeleteMapping("/eliminar/id") 
	 public void eliminar(PathVariable("id") Integer id) {
		 pasajeroDAO.deletebyid(id);
		 
	 }
		 
	 @PutMapping("/actualizar")
	 public void actualizar (RequestBody Pasajero pasajero) {
		 pasajeroDAO.save(pasajero);
		 
		 

}


	
	//GET, POST ,PUT , DELETE => 200 -500 -404
	
	
	
	
	
	
	

}
