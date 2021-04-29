package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Persona;
import service.PersonaService;

@RestController
@RequestMapping("/api-avon")

public class PersonaController {

	@Autowired
	private PersonaService personaservice;

	@GetMapping("/personas")
	public List<Persona> findAll() {
		return personaservice.findAll();

	}

	@PostMapping("/persona")
	public void insert(@RequestBody Persona persona) {
		personaservice.insert(persona);

	}

	@PutMapping("{id}/persona")
	public void update(@RequestBody Persona persona, @PathVariable(required = true) Long id) {
		personaservice.update(persona);

	}
	
	@DeleteMapping("{id}/persona")
	public void delete( @PathVariable(required = true) Long id) {
		personaservice.delete(id);
		
		
	}

}
