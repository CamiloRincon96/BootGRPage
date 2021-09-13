package com.example.curse.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "usuario2")
public class Usuario2 {

    @Getter @Setter @Column(name = "id")
    private int id;
    @Getter @Setter @Column(name = "usuario")
    private String usuario;
    @Getter @Setter @Column(name = "password")
    private String password;


}
