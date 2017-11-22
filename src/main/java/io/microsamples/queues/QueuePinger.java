package io.microsamples.queues;

import lombok.extern.slf4j.Slf4j;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.*;
import java.time.Instant;

@Slf4j
public class QueuePinger {

    public void ping() {

        String message = "Hello World " + Instant.now();

        this.template.send(queue, session -> session.createTextMessage(message));

        log.info(" [ \u2713 ] Sent {} ",  message);
    }


    public void setTemplate(JmsTemplate template) {
        this.template = template;
    }


    private JmsTemplate template;


    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    private Queue queue;

}
