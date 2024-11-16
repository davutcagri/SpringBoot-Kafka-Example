package davutcagri.kafka_consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "test-topic")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
