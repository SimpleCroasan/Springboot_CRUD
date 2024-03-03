package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import page.demo.model.Pais;

import java.util.List;
import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais, Long> {

    @Override
    List<Pais> findAll();

    @Override
    <S extends Pais> S save(S entity);

    @Override
    Optional<Pais> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
