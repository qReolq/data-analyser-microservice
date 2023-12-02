package qreol.project.dataanalysermicroservice.service;

import qreol.project.dataanalysermicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);

}
