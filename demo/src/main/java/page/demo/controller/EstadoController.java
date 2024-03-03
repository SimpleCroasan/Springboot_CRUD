package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;
import page.demo.service.EstadoService;
import page.demo.service.PaisService;
import  page.demo.model.Estado;
import java.util.List;

@RestController
@RequestMapping("/estado/")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/lista")
    private ResponseEntity<List<Estado>> getAllEstados(){


        return new ResponseEntity<>(estadoService.lista_estados(),HttpStatus.OK);
    }


}
