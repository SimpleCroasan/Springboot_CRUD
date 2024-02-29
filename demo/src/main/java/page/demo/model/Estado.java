package page.demo.model;

import jakarta.persistence.*;
import page.demo.repository.EstadoRepository;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;

    public Estado(String nombre) {
        this.nombre = nombre;
    }

    public Estado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
