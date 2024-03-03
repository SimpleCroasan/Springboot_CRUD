package page.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.demo.model.Estado;
import page.demo.model.Persona;
import page.demo.repository.PersonaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> lista_personas(){

        return personaRepository.findAll() ;
    }

    public void borrar_persona(long id){
        personaRepository.deleteById(id);

    }

    public Persona guardar_persona(Persona persona){
        personaRepository.save(persona);

        return persona;

    }

    public Optional<Persona> buscar_persona(long id){

        return personaRepository.findById(id);
    }

}

