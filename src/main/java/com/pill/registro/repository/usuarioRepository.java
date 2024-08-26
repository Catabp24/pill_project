package com.pill.registro.repository;

import com.pill.registro.controller.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario,Long>{
}
