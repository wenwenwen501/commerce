package com.company.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumerListener implements MessageListener<String, String> {

    protected final Logger LOG = LoggerFactory.getLogger("kafkaConsumer");

    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
        LOG.info("=============kafkaConsumer开始消费=============");
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        long offset = record.offset();
        int partition = record.partition();
        LOG.info("-------------topic:"+topic);
        LOG.info("-------------value:"+value);
        LOG.info("-------------key:"+key);
        LOG.info("-------------offset:"+offset);
        LOG.info("-------------partition:"+partition);
        LOG.info("~~~~~~~~~~~~~kafkaConsumer消费结束~~~~~~~~~~~~~");
    }
}