package davutcagri.kafka_producer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String topic, @RequestParam String message) {
        producerService.sendMessage(topic, message);
        return "Message sent";
    }
}
