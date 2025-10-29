package dev.LCM.email.consumer;

import dev.LCM.email.dto.EmailDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "email-queue")
    public void listenEmailQueue (@Payload EmailDTO emailDTO) {
        System.out.println(emailDTO.emailTo());

    }
}
