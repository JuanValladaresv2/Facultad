package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //Todas estas son notaciones, sirven para acortar el codigo repetitivo importandolas desde lombok
//boilerplate - Codigo repetitivo
@Data //Sirve para crear los metodos get y set
@NoArgsConstructor //Crea un costructor vacío
@AllArgsConstructor //Crea un constructor con todos los atributos (idEstudiante, nombre, apellido, etc)
@ToString //Crea el método ToString
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
