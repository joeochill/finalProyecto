package br.com.anhembi.tesis.repository;

import br.com.anhembi.tesis.entity.PerfilEmp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerfilEmpRepository extends MongoRepository<PerfilEmp, String> {
}
