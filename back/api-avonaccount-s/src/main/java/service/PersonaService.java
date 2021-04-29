package service;

import java.util.List;

import entity.Persona;

public interface PersonaService {

	List<Persona> findAll();

	void insert(Persona persona);

	void update(Persona persona);

	void delete(Long id);

	

}
