package qreol.project.dataanalysermicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public record Data(
        @Id
        String data_id,
        Long sensorId,
        LocalDateTime timestamp,
        double measurement,
        MeasurementType measurementType) {
}
