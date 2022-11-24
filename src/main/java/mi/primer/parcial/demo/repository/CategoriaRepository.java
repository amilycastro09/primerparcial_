package mi.primer.parcial.demo.repository;
import mi.primer.parcial.demo.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}