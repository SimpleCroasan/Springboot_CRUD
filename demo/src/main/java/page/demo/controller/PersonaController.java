package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import page.demo.model.Estado;
import page.demo.model.Pais;
import page.demo.model.Persona;
import page.demo.model.PersonaDTO;
import page.demo.repository.EstadoRepository;
import page.demo.repository.PaisRepository;
import page.demo.service.PersonaService;

import java.net.URI;
import java.util.List;

@RestController

@RequestMapping("/persona/")
public class    PersonaController {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private PaisRepository paisRepository;


    @GetMapping("/lista")
    private ResponseEntity<List<Persona>> getAllPersonas(){


        return new ResponseEntity<>(personaService.listaPersonas(), HttpStatus.OK);
    }

    @PostMapping("/lista")
    private ResponseEntity<Persona> savePersona(@RequestBody PersonaDTO dto) { Persona persona = new Persona();
        persona.setNombre(dto.getNombre());
        persona.setEdad(dto.getEdad());

        Pais pais = this.paisRepository.findById(dto.getIdPais())
                .orElseThrow(() -> new RuntimeException("País no encontrado"));
        Estado estado = this.estadoRepository.findById(dto.getIdEstado())
                .orElseThrow(() -> new RuntimeException("Estado no encontrado"));

        persona.setPais(pais);
        persona.setEstado(estado);

        Persona guardada = this.personaService.guardarPersona(persona);
        return ResponseEntity.ok(guardada);
    }


}
