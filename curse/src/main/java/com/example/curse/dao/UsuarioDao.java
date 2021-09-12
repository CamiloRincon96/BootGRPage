package com.example.curse.dao;

import com.example.curse.models.Usuario;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional

public interface UsuarioDao {

    List<Usuario> getUsuarios();
}
