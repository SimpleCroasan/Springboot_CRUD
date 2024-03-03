package page.demo.model;

import jakarta.persistence.*;
import lombok.*;
import page.demo.repository.EstadoRepository;

import javax.management.ConstructorParameters;

@Entity
@Table(name = "estado")
@NoArgsConstructor

public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Setter
    @Getter
    private String nombre;

    public Estado(String nombre) {
        this.nombre = nombre;
    }
}
