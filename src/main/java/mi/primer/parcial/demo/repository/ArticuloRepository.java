package mi.primer.parcial.demo.repository;

import mi.primer.parcial.demo.models.articulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticuloRepository extends JpaRepository<articulo,Long> {
    Optional<articulo> findByCodigo(String codigo);

}