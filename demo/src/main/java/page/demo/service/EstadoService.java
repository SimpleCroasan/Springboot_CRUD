package page.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.demo.model.Estado;
import page.demo.repository.EstadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> lista_estados(){

        return estadoRepository.findAll() ;
    }

    public void borrar_estado(long id){
        estadoRepository.deleteById(id);

    }

    public void guardar_estado(Estado estado){
        estadoRepository.save(estado);

    }

    public Optional<Estado> buscar_Estado(long id){

        return estadoRepository.findById(id);
    }

}
