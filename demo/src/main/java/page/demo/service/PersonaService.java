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

    public List<Persona> listaPersonas(){

        return personaRepository.findAll() ;
    }

    public void borrarPersona(long id){
        personaRepository.deleteById(id);

    }

    public Persona guardarPersona(Persona persona){
        personaRepository.save(persona);

        return persona;

    }

    public Optional<Persona> buscarPersona(long id){

        return personaRepository.findById(id);
    }

}

