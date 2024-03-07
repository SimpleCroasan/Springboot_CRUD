package page.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.util.Lazy;

@Entity
@Table(name="persona")
@NoArgsConstructor
public class Persona {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Getter
    @Setter
    @Column(name="Nombre_Completo")
    private String nombre;

    @Getter
    @Setter
    private int edad;

    @Getter
    @Setter
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_Pais")
    private Pais pais;

    @Getter
    @Setter
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_Estado")
    private Estado estado;

    public Persona(String nombre, int edad, Pais pais, Estado estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }






}
