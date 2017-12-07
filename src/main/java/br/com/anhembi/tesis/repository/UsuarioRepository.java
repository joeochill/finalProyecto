package br.com.anhembi.tesis.repository;

import br.com.anhembi.tesis.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByUsuario(String s);

}
