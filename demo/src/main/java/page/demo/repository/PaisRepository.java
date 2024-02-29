package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import page.demo.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
