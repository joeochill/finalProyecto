package br.com.anhembi.tesis.repository;

import br.com.anhembi.tesis.entity.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventoRepository extends MongoRepository<Evento, String> {
}
