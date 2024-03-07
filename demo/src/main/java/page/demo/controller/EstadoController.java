package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;
import page.demo.service.EstadoService;
import page.demo.service.PaisService;
import  page.demo.model.Estado;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado/")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/lista")
    private ResponseEntity<List<Estado>> getAllEstados(){


        return new ResponseEntity<>(estadoService.listaEstados(),HttpStatus.OK);
    }

    @GetMapping("/lista/pais{id}")
    private ResponseEntity<Optional<List<Estado> > > getEstadosByPais(@PathVariable long id){


        return new ResponseEntity<>(estadoService.buscarEstadoPorPais(id),HttpStatus.OK);
    }


}
