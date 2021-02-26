package ru.vladigeras.kafkasimple.model.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable {

    private static final long serialVersionUID = -1363405494020911419L;

    private String id;
    private String message;
    private LocalDateTime date;
}
