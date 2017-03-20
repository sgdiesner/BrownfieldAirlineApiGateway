Based on Ravesh RV's Brownfield Airline Demo Chapter 5 (PACKT Spring Microservices)

Converted to use Gradle scripts and latest Spring Boot 1.5.3.

Corrected the run sequence.

Follow below steps to run the application. 

1. Build all gradle projects

2. Start Rabbit MQ. 

3.Run below commands in separate terminal windows. 

Hint: Note that wait for 40-60 seconds before starting the next service. This will ensure that the dependent services are registered and are available before we starting a new service.

java -jar Configserver/build/libs/config-server-1.0.jar
java -jar Eurekaserver\build\libs\eureka-server-1.0.jar
java -jar Fares/build/libs/fares-1.0.jar
java -jar Search/build/libs/search-1.0.jar
java -jar Checkin/build/libs/checkin-1.0.jar
java -jar Book/build/libs/book-1.0.jar
java –jar Fares-apigateway/build/libs/fares-apigateway-1.0.jar
java –jar Search-apigateway/build/libs/search-apigateway-1.0.jar
java –jar Checkin-apigateway/build/libs/checkin-apigateway-1.0.jar
java –jar Book-apigateway/build/libs/book-apigateway-1.0.jar
java -jar Website/build/libs/website-1.0.jar

Open the browser window and point to http://localhost:8001. 