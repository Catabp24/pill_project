package com.pill.registro.controller;

import com.pill.registro.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/nuevo")

    public Usuario newUsuario(@RequestBody Usuario newUsuario) {
        return this.usuarioService.newUsuario(newUsuario);


    }

    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll() {
        return usuarioService.getAll();

    }
    @PostMapping("/modificar")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.modifyUsuario(usuario);

    }
    @PostMapping(value = "/{id}")
    public boolean deleteUsuario(@PathVariable(value ="id")long id){
        return this.usuarioService.deleteUsuario(id);
    }


}
