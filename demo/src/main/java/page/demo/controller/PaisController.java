package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import page.demo.model.Pais;
import page.demo.service.PaisService;

import java.util.List;

@RestController
@RequestMapping("/pais/")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/lista")
    private ResponseEntity<List<Pais>> getAllPaises(){


        return new ResponseEntity<>(paisService.listaPaises(), HttpStatus.OK);
    }


}
