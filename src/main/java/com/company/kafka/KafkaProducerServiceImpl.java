package com.company.kafka;

import com.company.controller.dto.BaseDto;
import com.company.kafka.service.KafkaProducerService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void getProducer() {
        kafkaTemplate.send("topic success", "测试内容");
    }
}
