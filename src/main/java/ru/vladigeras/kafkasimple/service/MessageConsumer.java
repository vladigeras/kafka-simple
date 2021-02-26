package ru.vladigeras.kafkasimple.service;

import ru.vladigeras.kafkasimple.model.domain.Message;

public interface MessageConsumer {

    void get(Message message);
}
