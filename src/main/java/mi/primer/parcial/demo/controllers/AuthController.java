package mi.primer.parcial.demo.controllers;

import mi.primer.parcial.demo.models.Usuario;
import mi.primer.parcial.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "auth/login")

    public ResponseEntity login(@RequestBody Usuario usuario){
        return usuarioService.login(usuario.getCorreo(), usuario.getPassword());

    }

}