# Springboot-Microservices-Messaging-with-activeMQ-broker
This Example demostrates how activeMQ can be used as messaging broker in a micro-services

# How to run
Download activeMQ http://activemq.apache.org/components/classic/download/ and unzip it to your desired location
From extracted content go to ``bin`` folder and run the command `` activemq.bat start``

Run the two applications and check the console
Sender: http://localhost:8081
Receiver: http://localhost:8080

The sender will send the message, and the broker will foward it to the receiver.
Learn more: https://acemycode.com/

Credit: https://studypool.us/ software engineers
