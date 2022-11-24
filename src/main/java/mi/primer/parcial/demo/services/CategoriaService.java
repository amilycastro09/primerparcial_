package mi.primer.parcial.demo.services;

import mi.primer.parcial.demo.models.Categoria;
import org.springframework.http.ResponseEntity;
import java.util.List;
public interface CategoriaService {
    ResponseEntity<Categoria> createCategoria(Categoria categoria);

    ResponseEntity<List<Categoria>> allCategorias();
}