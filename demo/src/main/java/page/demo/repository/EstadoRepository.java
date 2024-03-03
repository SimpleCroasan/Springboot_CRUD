package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import page.demo.model.Estado;

import java.util.List;
import java.util.Optional;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    @Override
    List<Estado> findAll();

    @Override
    void flush();

    @Override
    <S extends Estado> S save(S entity);

    @Override
    Optional<Estado> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}