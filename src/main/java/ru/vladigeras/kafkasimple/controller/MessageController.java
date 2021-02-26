package ru.vladigeras.kafkasimple.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.vladigeras.kafkasimple.mapper.MessageMapper;
import ru.vladigeras.kafkasimple.model.dto.MessageDto;
import ru.vladigeras.kafkasimple.service.MessageProducer;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/messages")
public class MessageController {

    private final MessageProducer producer;
    private final MessageMapper messageMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void send(@RequestBody MessageDto message) {
        log.info("Got Message - {}", message);
        producer.send(messageMapper.map(message));
    }
}
