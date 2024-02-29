package page.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pais")
public class Pais  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
