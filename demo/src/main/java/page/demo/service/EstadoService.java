package page.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import page.demo.model.Estado;
import page.demo.repository.EstadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> listaEstados(){

        return estadoRepository.findAll() ;
    }

    public void borrarEstado(long id){
        estadoRepository.deleteById(id);

    }

    public void guardarEstado(Estado estado){
        estadoRepository.save(estado);

    }

    public Optional<Estado> buscarEstado(long id){

        return estadoRepository.findById(id);
    }

    public Optional<List<Estado>> buscarEstadoPorPais(long id){

        return Optional.ofNullable(estadoRepository.BuscarPorPais(id));

    }



}
