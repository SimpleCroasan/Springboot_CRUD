package page.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    private long id;
    private String nombre;
    private int edad;
}
