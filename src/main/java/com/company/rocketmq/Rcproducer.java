package com.company.rocketmq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
@Component
public class Rcproducer {

    @Autowired
    DefaultMQProducer defaultMQProducer;


    public void sendmsg() throws Exception {

        for (int i = 0; i < 100; i++) {
            Message msg = new Message("test_from_java_project" /* Topic */,
                    "rocket_mq_success" /* Tag */,
                    ("rocket_mq_success " + i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //投递消息到其中一个brokers
            SendResult sendResult = defaultMQProducer.send(msg);
            System.out.printf("%s%n", sendResult);
        }

    }
}
