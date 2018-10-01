//package test;
//
//import static org.junit.Assert.*;
//import java.util.List;
//import javax.ejb.embeddable.EJBContainer;
//import ias.com.co.domain.Persona;
//import ias.com.co.servicio.PersonaService;
//import org.junit.Before;
//import org.junit.Test;
//
//public class PersonaServiceTest {
//    private PersonaService personaService;
//
//    @Before
//    public void setUp() throws Exception {
//        EJBContainer contenedor = EJBContainer.createEJBContainer();
//        personaService = (PersonaService) contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!ias.com.co.servicio.PersonaService");
//    }
//    
//    private void desplegarPersonas(List<Persona> personas) {
//        personas.forEach((persona) -> {
//            System.out.println(persona);
//        });
//    }
//    @Test
//    public void testEJBPersonaService() {
//        System.out.println("Iniciando test EJB PersonaService");
//        assertTrue(personaService != null);
//
//        assertEquals(4, personaService.listarPersonas().size());
//
//        System.out.println("El no. de personas es igual a:" + personaService.listarPersonas().size());
//
//        this.desplegarPersonas(personaService.listarPersonas());
//        System.out.println("Fin test EJB PersonaService");
//    }
//}
