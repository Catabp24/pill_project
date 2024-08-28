package com.pill.registro.controller;

import com.pill.registro.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario newUsuario(@RequestBody Usuario newUsuario) {
        return this.usuarioService.newUsuario(newUsuario);


    }

    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll() {
        return usuarioService.getAll();

    }
    @PostMapping("/modificar")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.modifyUsuario(usuario);

    }
    @DeleteMapping(value = "/usuarios/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable(value = "id") long id) {
        boolean isDeleted = this.usuarioService.deleteUsuario(id);

        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204 No Content
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found si el usuario no fue encontrado
        }
    }


}
