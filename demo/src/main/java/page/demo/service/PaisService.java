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

    public List<Pais> lista_paises(){

        return paisRepository.findAll() ;
    }

    public void borrar_pais(long id){
        paisRepository.deleteById(id);

    }

    public void guardar_pais(Pais pais){
        paisRepository.save(pais);

    }

    public Optional<Pais> buscar_pais(long id){

        return paisRepository.findById(id);
    }
}
