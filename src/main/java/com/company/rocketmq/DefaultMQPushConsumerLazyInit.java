package com.company.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class DefaultMQPushConsumerLazyInit extends DefaultMQPushConsumer implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            if (event.getApplicationContext().getParent() == null){
//                System.out.println("rocketmq consumer execute start method ...");
            }
                this.start();
        } catch (Exception e) {
            //调用start失败，导致rocket启动失败
            System.out.println(e.getMessage());
        }
    }

}
