package ru.vladigeras.kafkasimple.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.vladigeras.kafkasimple.model.domain.Message;
import ru.vladigeras.kafkasimple.service.MessageConsumer;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageConsumerImpl implements MessageConsumer {

    @Override
    @KafkaListener(topics = "${app.topic.name}", groupId = "${app.group.id}")
    public void get(Message message) {
        log.info("Consume message - {}", message);
    }
}
