package page.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.util.Lazy;

@Entity
@Table(name="persona")
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class Persona {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


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






}
