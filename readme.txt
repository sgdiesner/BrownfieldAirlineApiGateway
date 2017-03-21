Based on Ravesh RV's Brownfield Airline Demo Chapter 5 (PACKT Spring Microservices)

Converted to use Gradle scripts and latest Spring Boot 1.5.3.

Corrected the run sequence.

Follow below steps to run the application. 

1. Build all gradle projects (ignore the test failures - TODO resolve - they don't impact the running of the services).

2. Start Rabbit MQ (if not a Windows Service)

3.Run below commands in separate terminal windows. 

Hint: Note that wait for 40-60 seconds before starting the next service. This will ensure that the dependent services are registered and are available before we starting a new service.

java -jar Configserver/build/libs/config-server-1.0.jar
java -jar Eurekaserver/build/libs/eureka-server-1.0.jar
java -jar Fares/build/libs/fares-1.0.jar
java -jar Search/build/libs/search-1.0.jar
java -jar Checkin/build/libs/checkin-1.0.jar
java -jar Book/build/libs/book-1.0.jar
java -jar Fares-apigateway/build/libs/fares-apigateway-1.0.jar
java –jar Search-apigateway/build/libs/search-apigateway-1.0.jar
java –jar Checkin-apigateway/build/libs/checkin-apigateway-1.0.jar
java –jar Book-apigateway/build/libs/book-apigateway-1.0.jar
java -jar Website/build/libs/website-1.0.jar

Open the browser window and point to http://localhost:8001. 

Feign issue
===========

http://stackoverflow.com/questions/42033109/netflix-feign-exception
https://github.com/spring-cloud/spring-cloud-netflix/issues/1025

RabbitMQ Issues
===============

    CMD @ C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.8\sbin
    > rabbitmqctl status
    Status of node rabbit@Haverford ...
    Error: unable to connect to node rabbit@Haverford: nodedown

    DIAGNOSTICS
    ===========

    attempted to contact: [rabbit@Haverford]

    rabbit@Haverford:
      * connected to epmd (port 4369) on Haverford
      * epmd reports node 'rabbit' running on port 25672
      * TCP connection succeeded but Erlang distribution failed

      * Authentication failed (rejected by the remote node), please check the Erlang cookie


    current node details:
    - node name: 'rabbitmq-cli-22@Haverford'
    - home dir: C:\Users\Steve
    - cookie hash: 6xTyEQhV3OT1OLR5pLWeNA==


    copy c:\windows\.erlang.cookie to c:\users\steve (they have got out of sync)

    CMD @ C:\Program Files\RabbitMQ Server\rabbitmq_server-3.6.8\sbin
    > rabbitmqctl start_app
    Starting node rabbit@Haverford ...

Zuul Issue
==========

java.lang.ClassNotFoundException: org.springframework.boot.context.embedded.ServletRegistrationBean

https://github.com/spring-projects/spring-boot/issues/8186