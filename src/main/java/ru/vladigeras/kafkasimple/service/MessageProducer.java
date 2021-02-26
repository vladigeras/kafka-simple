package ru.vladigeras.kafkasimple.service;

import ru.vladigeras.kafkasimple.model.domain.Message;

public interface MessageProducer {

    void send(Message message);
}
