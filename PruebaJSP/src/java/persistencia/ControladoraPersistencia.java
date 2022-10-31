package persistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    PersonaJpaController perJPA = new PersonaJpaController();

    public ControladoraPersistencia() {
    }
    
    
    public void crearPersona (Persona per){
        perJPA.create(per);
    }
    
    public void eliminarPersona(int id){
        try {
            perJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona (Persona pers){
        try {
            perJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> trarPersonas(){
        return perJPA.findPersonaEntities();
    }
}
