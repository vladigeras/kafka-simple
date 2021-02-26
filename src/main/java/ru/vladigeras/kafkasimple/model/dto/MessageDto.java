package ru.vladigeras.kafkasimple.model.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(onConstructor=@__(@JsonCreator))
public class MessageDto {

    @JsonProperty("message")
    private final String message;
}
