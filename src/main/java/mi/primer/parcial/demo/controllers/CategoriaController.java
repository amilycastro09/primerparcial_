package mi.primer.parcial.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
    @Autowired
    private ArticuloService almacenService;

    @PostMapping(value = "aut/login")
    public ResponseEntity login(@RequestBody Articulo articulo){
        return articuloService.login(articulo.getCorreo(),articulo.getPassword());

    }

}

