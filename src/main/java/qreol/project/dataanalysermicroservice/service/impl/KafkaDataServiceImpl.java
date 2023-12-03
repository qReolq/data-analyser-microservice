package qreol.project.dataanalysermicroservice.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import qreol.project.dataanalysermicroservice.model.Data;
import qreol.project.dataanalysermicroservice.repository.DataRepository;
import qreol.project.dataanalysermicroservice.service.KafkaDataService;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final DataRepository dataRepository;

    @Override
    public void handle(Data data) {
        log.info("Data object {} was saved", data);
        dataRepository.insert(data);
    }

}
