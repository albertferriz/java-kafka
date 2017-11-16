package com.privalia.producer;

import org.slf4j.Logger;
import lombok.extern.java.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Log
public class Sender {

    public static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String payload)
    {
        LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
        //log.info("sending payload='{}' to topic='{}'");
        kafkaTemplate.send(topic, payload);
    }
}
