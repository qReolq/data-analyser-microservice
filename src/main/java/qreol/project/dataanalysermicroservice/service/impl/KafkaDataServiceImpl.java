package qreol.project.dataanalysermicroservice.service.impl;

import org.springframework.stereotype.Service;
import qreol.project.dataanalysermicroservice.model.Data;
import qreol.project.dataanalysermicroservice.service.KafkaDataService;

@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    @Override
    public void handle(Data data) {
        System.out.println("Data object is received: " + data);
    }

}
