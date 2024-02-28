package page.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="Nombre_Completo")
    private String nombre;
    private int edad;
    @ManyToOne
    @JoinColumn(name="Id_Pais")
    private Pais pais;
    @ManyToOne
    @JoinColumn(name="Id_Estado")
    private Estado estado;

    public Persona(String nombre, int edad, Pais pais, Estado estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }

    public Persona() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}
