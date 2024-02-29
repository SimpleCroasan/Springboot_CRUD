package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import page.demo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
