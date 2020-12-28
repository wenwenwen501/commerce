package com.company.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class RocketmqMessageListenersImpl extends DefaultMQPushConsumer {

    public void start() throws MQClientException {

        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("myconsumer-mq");
        consumer.registerMessageListener(new RocketmqMessageListeners());
        consumer.start();
    }

}
