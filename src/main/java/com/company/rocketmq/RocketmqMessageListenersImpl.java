package com.company.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQClientException;

public class RocketmqMessageListenersImpl extends DefaultMQPushConsumer {

    public void start() throws MQClientException {

        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("myconsumer-mq");
        consumer.registerMessageListener(new RocketmqMessageListeners());
        consumer.start();
    }

}
