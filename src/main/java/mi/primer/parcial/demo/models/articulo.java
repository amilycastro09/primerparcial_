package mi.primer.parcial.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity

public class articulo {

    private Long id;
    private String nombre;
    private String descripcion;
    private Date FechadeRegistro;
    private String Categoria;
    private String stock;
    private String PreciodeVenta;
    private String PreciodeCompra;






}
