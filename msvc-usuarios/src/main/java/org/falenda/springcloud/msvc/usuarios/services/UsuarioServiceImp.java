package org.falenda.springcloud.msvc.usuarios.services;

import org.falenda.springcloud.msvc.usuarios.models.entities.Usuario;
import org.falenda.springcloud.msvc.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImp implements  UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> porId(Long id) {
        Optional<Usuario> o = usuarioRepository.findById(id);

        return o;
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
