package page.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.demo.repository.EstadoRepository;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

}
