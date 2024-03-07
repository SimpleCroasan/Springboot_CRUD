package page.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.demo.model.Estado;
import page.demo.model.Pais;
import page.demo.repository.PaisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> listaPaises(){

        return paisRepository.findAll() ;
    }

    public void borrarPais(long id){
        paisRepository.deleteById(id);

    }

    public void guardarPais(Pais pais){
        paisRepository.save(pais);

    }

    public Optional<Pais> buscarPais(long id){

        return paisRepository.findById(id);
    }
}
