# Communication to ActiveMQ service provisioned on PCF

Demonstrates the use of embedded ActiveMQ Broker.

This could be used as an intermediate step during the replatofrming, when 
applications use external JMS provider that will not be available anyore.

## Todo

As a next step, we need to extract this app as a Spring Boot app that can be
used as a JMS provider registering with Discovery service.