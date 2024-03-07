package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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


        return new ResponseEntity<>(personaService.listaPersonas(), HttpStatus.OK);
    }

    @PostMapping("/lista")
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        try {
            if (persona == null) {
                return ResponseEntity.badRequest().build();
            }

            Persona personaGuardada = personaService.guardarPersona(persona);

            return ResponseEntity.created(new URI("/persona/lista/" + persona.getId())).body(persona);


        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }


}
