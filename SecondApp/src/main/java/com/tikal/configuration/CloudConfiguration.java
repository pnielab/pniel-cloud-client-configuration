package com.tikal.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Pniel Abramovich
 */
@Configuration
public class CloudConfiguration {

    @Bean
    @LoadBalanced
    RestTemplate loadBalancedRestTemplate(){
        return new RestTemplate();
    }

}
