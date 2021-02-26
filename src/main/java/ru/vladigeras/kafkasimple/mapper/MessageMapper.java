package ru.vladigeras.kafkasimple.mapper;

import java.time.LocalDateTime;
import java.util.UUID;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.vladigeras.kafkasimple.model.domain.Message;
import ru.vladigeras.kafkasimple.model.dto.MessageDto;

@Mapper(imports = {UUID.class, LocalDateTime.class})
public interface MessageMapper {

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "date", expression = "java(LocalDateTime.now())")
    @Mapping(target = "message", source = "message")
    @BeanMapping(ignoreByDefault = true)
    Message map(MessageDto message);
}
