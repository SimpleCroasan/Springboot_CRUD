package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import page.demo.model.Persona;
import page.demo.service.PersonaService;

import java.net.URI;
import java.util.List;

@RestController

@RequestMapping("/persona/")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/lista")
    private ResponseEntity<List<Persona>> getAllPersonas(){


        return new ResponseEntity<>(personaService.lista_personas(), HttpStatus.OK);
    }

    @PostMapping("/lista")
    private ResponseEntity<Persona> savePersona(Persona persona) {
        try {
            if (persona == null) {
                return ResponseEntity.badRequest().build();
            }

            Persona personaGuardada = personaService.guardar_persona(persona);

            return ResponseEntity.created(new URI("/persona/lista/" + persona.getId())).body(persona);


        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }


}
