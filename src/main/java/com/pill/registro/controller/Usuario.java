package com.pill.registro.controller;
//clase para elaborar la entidad de la aplicacion

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Usuario {
    @Id
    @Column
    private Long iduser;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correo;

    @Column
    private String numTelefono;

}

