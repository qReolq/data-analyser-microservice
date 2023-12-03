package qreol.project.dataanalysermicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import qreol.project.dataanalysermicroservice.model.Data;

public interface DataRepository extends MongoRepository<Data, Long> {
}
