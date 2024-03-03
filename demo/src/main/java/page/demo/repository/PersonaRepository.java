package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.lang.NonNullApi;
import page.demo.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    @Override

    List<Persona> findAll();

    @Override

    <S extends Persona> S save(S entity);

    @Override
    Optional<Persona> findById(Long aLong);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);
}
