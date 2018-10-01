package ias.com.co.domain;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import ias.com.co.domain.Persona;
import ias.com.co.eis.PersonaDao;
import java.util.ArrayList;
import ias.com.co.servicio.PersonaServiceRemote;
import ias.com.co.servicio.PersonaService;

@Stateless 
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    
	@Inject//Se puede utilizar tbn @EJB. La @Inject tiene compativilidad con navegadores  mas antiguos
	private PersonaDao personaDao;

        @Override
	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}

        @Override
	public Persona encontrarPersonaPorId(Persona persona) {
		return personaDao.findPersonaById(persona);
	}

        @Override
	public Persona encontrarPersonaPorEmail(Persona persona) {
		return personaDao.findPersonaByEmail(persona);
	}

        @Override
	public void registrarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}

        @Override
	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}

        @Override
	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}
}
