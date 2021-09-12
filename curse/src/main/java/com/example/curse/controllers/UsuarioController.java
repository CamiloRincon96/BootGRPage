package com.example.curse.controllers;

import com.example.curse.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

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
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(23432L);
        usuario.setNombre("Camilo");
        usuario.setApellido("Rincón");
        usuario.setEmail("jcamilor96@gmail.com");
        usuario.setTelefono("3124324213");

        Usuario usuario2 = new Usuario();
        usuario2.setId(32432432L);
        usuario2.setNombre("Juanito");
        usuario2.setApellido("Ramírez");
        usuario2.setEmail("Juancho@gmail.com");
        usuario2.setTelefono("214124");

        Usuario usuario3 = new Usuario();
        usuario3.setId(543534L);
        usuario3.setNombre("Juancho");
        usuario3.setApellido("Rincón");
        usuario3.setEmail("Juancho@gmail.com");
        usuario3.setTelefono("3242344");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
