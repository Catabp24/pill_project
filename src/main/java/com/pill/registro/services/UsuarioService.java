package com.pill.registro.services;

import com.pill.registro.controller.Usuario;

public interface UsuarioService {
    Usuario newUsuario (Usuario newUsuario);
    Iterable<Usuario> getAll();
    Usuario modifyUsuario (Usuario usuario);
    Boolean deleteUsuario (Long iduser);
}
