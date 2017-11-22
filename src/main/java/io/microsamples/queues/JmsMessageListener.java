package io.microsamples.queues;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

@Slf4j
public class JmsMessageListener implements SessionAwareMessageListener<TextMessage> {
    @Override
    public void onMessage(TextMessage m, Session session) throws JMSException {
        log.info(" [ \u2713 ] Received {} ", m);

    }
}
