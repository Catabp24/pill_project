package com.pill.registro.services;

import com.pill.registro.controller.Usuario;
import com.pill.registro.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UsuarioServiceImp implements UsuarioService{
    @Autowired
     private usuarioRepository usuarioRepository;

    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);


    }

    @Override
    public Iterable<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        Optional<Usuario> usuarioEncontrado= this.usuarioRepository.findById(usuario.getIduser());
            if (usuarioEncontrado.get()!=null){
                usuarioEncontrado.get().setNombre(usuario.getNombre());
                usuarioEncontrado.get().setApellido(usuario.getApellido());
                usuarioEncontrado.get().setCorreo(usuario.getCorreo());
                usuarioEncontrado.get().setNumTelefono(usuario.getNumTelefono());
                return this.newUsuario(usuarioEncontrado.get());

    }

        return null;
    }

    @Override
    public Boolean deleteUsuario(Long iduser) {
        this.usuarioRepository.deleteById(iduser);
        return true;}
}