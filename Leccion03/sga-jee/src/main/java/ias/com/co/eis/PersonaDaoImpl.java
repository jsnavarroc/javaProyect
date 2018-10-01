package ias.com.co.eis;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ias.com.co.domain.Persona;
// Con esta anotacion lo reconoce como un EJB
@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        // Implementamos el SQL que se encuentra Domain en Persona
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.merge(persona);
        em.remove(persona);
    }
    
}
