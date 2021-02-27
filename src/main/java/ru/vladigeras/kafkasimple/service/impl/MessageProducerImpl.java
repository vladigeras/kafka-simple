package ru.vladigeras.kafkasimple.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.vladigeras.kafkasimple.model.domain.Message;
import ru.vladigeras.kafkasimple.service.MessageProducer;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageProducerImpl implements MessageProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    @Value("${app.topic.name}")
    private String topicName;

    @Override
    public void send(Message message) {
        log.info("Produce message - {}", message);
        kafkaTemplate.send(topicName, message.getId(), message);
    }
}
