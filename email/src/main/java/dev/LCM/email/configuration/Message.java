package dev.LCM.email.configuration;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Message {

    private final String queueMessage = "email-queue";

    public Queue queue() {
        return new Queue(queueMessage, true);
    }
}
