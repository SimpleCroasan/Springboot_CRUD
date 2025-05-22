package page.demo.model;

import lombok.Data;

@Data
public class PersonaDTO {
    private String nombre;
    private int edad;
    private Long idPais;
    private Long idEstado;

    // Getters y Setters
}
