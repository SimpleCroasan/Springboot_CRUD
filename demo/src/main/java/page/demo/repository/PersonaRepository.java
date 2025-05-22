package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;
import page.demo.model.Persona;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
