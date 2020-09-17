package com.myz.service1.service;

import com.myz.service1.api.ConsumerService;

@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String service() {
        return "Consumer invoke " ;
    }
}
