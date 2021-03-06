package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Persona;
import repository.PersonaRepository;
import service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<Persona> findAll() {

		return personaRepository.findAll();
	}

	@Override
	public void insert(Persona persona) {
		if (findById(persona.getId()) == null) {
			personaRepository.save(persona);

		}

	}

	@Override
	public void update(Persona persona) {
		if (findById(persona.getId()) != null) {
			personaRepository.save(persona);

		}

	}

	private Persona findById(Long id) {

		return personaRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		personaRepository.deleteById(id);

	}

}
