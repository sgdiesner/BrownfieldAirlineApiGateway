Based on Ravesh RV's Brownfield Airline Demo Chapter 5 (PACKT Spring Microservices)

Converted to use Gradle scripts and latest Spring Boot 1.5.3.Chapter 5

Follow below steps to run the application. 

1. Build all gradle projects

2. Start Rabbit MQ. 

3.Run below commands in separate terminal windows. 

Hint: Note that wait for 40-60 seconds before starting the next service. This will ensure that the dependent services are registered and are available before we starting a new service.

java -jar target/fares-1.0.jar
java -jar target/search-1.0.jar
java -jar target/checkin-1.0.jar
java -jar target/book-1.0.jar
java –jar target/fares-apigateway-1.0.jar
java –jar target/search-apigateway-1.0.jar
java –jar target/checkin-apigateway-1.0.jar
java –jar target/book-apigateway-1.0.jar
java -jar target/website-1.0.jar

Open the browser window and point to http://localhost:8001. 