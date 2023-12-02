package qreol.project.dataanalysermicroservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Data {

    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement;
    private MeasurementType MeasurementType;

    @Override
    public String toString() {
        return "Data{" +
                "sensorId=" + sensorId +
                ", timestamp=" + timestamp +
                ", measurement=" + measurement +
                ", MeasurementType=" + MeasurementType +
                '}';
    }
}
