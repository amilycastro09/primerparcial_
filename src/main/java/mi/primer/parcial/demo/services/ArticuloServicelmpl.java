package mi.primer.parcial.demo.services;

import mi.primer.parcial.demo.models.articulo;
import mi.primer.parcial.demo.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServicelmpl implements ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public ResponseEntity<articulo> createArticulo(articulo articulo) {
        try {
            articuloRepository.save(articulo);
            return new ResponseEntity(articulo, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();

        }
    }

    @Override
    public ResponseEntity<articulo> getArticuloByCodigo(String codigo) {
        Optional<articulo> articulos = articuloRepository.findByCodigo(codigo);
        if (!articulos.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity(articulos, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<articulo> editArticulo(String codigo, articulo articulo) {
        Optional<articulo> articuloBD= articuloRepository.findByCodigo(codigo);
        if (articuloBD.isPresent()) {
            try {
                articuloBD.get().setNombre(articulo.getNombre());
                articuloBD.get().setDescripcion(articulo.getDescripcion());
                articuloBD.get().setFechadeRegistro(articulo.getFechadeRegistro());
                articuloBD.get().setStock(articulo.getStock());
                articuloBD.get().setCategoria(articulo.getCategoria());
                articuloBD.get().setPreciodeVenta(articulo.getPreciodeVenta());
                articuloBD.get().setPreciodeCompra(articulo.getPreciodeCompra());

                articuloRepository.save(articuloBD.get());
                return new ResponseEntity(articuloBD, HttpStatus.OK);

            } catch (Exception e) {
                return ResponseEntity.badRequest().build();

            }




        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<articulo> deleteArticuloByCodigo(String codigo) {
        Optional<articulo> articuloBD = articuloRepository.findByCodigo(codigo);
        if(articuloBD.isPresent()){
            articuloRepository.delete(articuloBD.get());
            return  ResponseEntity.noContent().build();

        }


        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<articulo>> allArticulos() {
        List<articulo> articulos= articuloRepository.findAll();
        if(articulos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity(articulos,HttpStatus.OK);
    }
}