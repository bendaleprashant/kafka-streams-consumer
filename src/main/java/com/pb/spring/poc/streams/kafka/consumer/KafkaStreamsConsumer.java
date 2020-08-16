package com.pb.spring.poc.streams.kafka.consumer;

import com.pb.spring.poc.streams.kafka.model.trades.dto.Trade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaStreamsConsumer {

    @StreamListener("input")
    public void consumeMessage(Trade trade) {
        log.info("Message received: " + trade);
    }
}
