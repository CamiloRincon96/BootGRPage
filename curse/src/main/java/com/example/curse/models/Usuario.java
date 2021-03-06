package com.example.curse.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLA_MOVIMIENTOS")
@ToString @EqualsAndHashCode
public class Usuario {

    @Getter  @Setter @Column(name = "id")
    @Id
    private Long id;
    @Getter  @Setter @Column(name = "nombre")
    private String nombre;
    @Getter  @Setter @Column(name = "apellido")
    private String apellido;
    @Getter  @Setter @Column(name = "email")
    private String email;
    @Getter  @Setter @Column(name = "telefono")
    private String telefono;
    @Getter  @Setter @Column(name = "password")
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
