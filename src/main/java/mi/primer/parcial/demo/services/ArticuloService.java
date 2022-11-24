package mi.primer.parcial.demo.services;

import mi.primer.parcial.demo.models.articulo;
import mi.primer.parcial.demo.models.Categoria;
import org.springframework.http.ResponseEntity;
import java.util.List;
public interface ArticuloService {
    ResponseEntity<articulo> createArticulo(articulo articulo);

    ResponseEntity<articulo> getArticuloByCodigo(String codigo);

    ResponseEntity<articulo> editArticulo(String codigo, articulo articulo);

    ResponseEntity<articulo> deleteArticuloByCodigo(String codigo);

    ResponseEntity<List<articulo>> allArticulos();
}