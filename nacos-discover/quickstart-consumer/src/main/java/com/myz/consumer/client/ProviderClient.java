package com.myz.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value ="quickstart-provider" )
public interface ProviderClient {

    @GetMapping("/provider")
    public String provider();
}