package page.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.demo.repository.PaisRepository;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;
}
