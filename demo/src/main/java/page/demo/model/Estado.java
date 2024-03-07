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

    @Setter
    @Getter
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pais_id")
    private  Pais pais;

    public Estado(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
}
