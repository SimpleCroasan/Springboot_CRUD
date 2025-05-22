package page.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import page.demo.model.Estado;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {


    @Query("SELECT e FROM Estado e WHERE e.pais.id =:paisId ")
    List<Estado> BuscarPorPais(@Param("paisId") long id);
}