package org.falenda.springcloud.msvc.usuarios.repositories;

import org.falenda.springcloud.msvc.usuarios.models.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
