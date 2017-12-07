package br.com.anhembi.tesis.repository;

import br.com.anhembi.tesis.entity.Vaga;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VagaRepository extends MongoRepository<Vaga, String> {
}
