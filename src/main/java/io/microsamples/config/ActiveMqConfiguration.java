package io.microsamples.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.broker.BrokerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

@Configuration
@Slf4j
public class ActiveMqConfiguration {

        @Value("${mq.brokerUrl}")
        private String brokerUrl;

        @Bean
        public BrokerService broker() throws Exception {
            BrokerService brokerService = new BrokerService();
            brokerService.addConnector(new URI(brokerUrl));
            brokerService.setPersistent(false);
            log.info("Initialized ActiveMq Broker {}", brokerUrl);
            return brokerService;
        }
}
