package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import page.demo.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
