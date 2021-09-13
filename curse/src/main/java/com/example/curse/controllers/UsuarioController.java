package com.example.curse.controllers;

import com.example.curse.dao.UsuarioDao;
import com.example.curse.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Camilo");
        usuario.setApellido("Rincón");
        usuario.setEmail("jcamilor96@gmail.com");
        usuario.setTelefono("3124324213");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario>  getUsuarios(){
    return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario543")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Rincón");
        usuario.setEmail("jcamilor96@gmail.com");
        usuario.setTelefono("3124324213");
        return usuario;
    }

    @RequestMapping(value = "usuario434")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Rincón");
        usuario.setEmail("jcamilor96@gmail.com");
        usuario.setTelefono("3124324213");
        return usuario;
    }

    @RequestMapping(value = "usuario3123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Rincón");
        usuario.setEmail("jcamilor96@gmail.com");
        usuario.setTelefono("3124324213");
        return usuario;
    }

}
