package com.myz.consumer.controller;

import com.myz.consumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("consumer")
    public String consumer() {
        String provider = providerClient.provider();
        return "consumer invoke " + "|" + provider;
    }
}