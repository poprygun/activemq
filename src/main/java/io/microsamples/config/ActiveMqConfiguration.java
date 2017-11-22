package io.microsamples.config;

import org.apache.activemq.broker.BrokerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

@Configuration
public class ActiveMqConfiguration {

        private static final String BROKER_URL = "tcp://localhost:61616";

        @Bean
        public BrokerService broker() throws Exception {
            BrokerService brokerService = new BrokerService();
            brokerService.addConnector(new URI(BROKER_URL));
            brokerService.setPersistent(false);
            return brokerService;
        }
}
