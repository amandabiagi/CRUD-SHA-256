package crudsha256.crud.completo.repositories;

import crudsha256.crud.completo.dominius.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
