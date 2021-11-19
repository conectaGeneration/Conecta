package br.com.generation.redesocial.conecta.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.redesocial.conecta.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	public Optional<Usuario> findByEmail(String email);
<<<<<<< HEAD

}
=======
	
}
>>>>>>> main
