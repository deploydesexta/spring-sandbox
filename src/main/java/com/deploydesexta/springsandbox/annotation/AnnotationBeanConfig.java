package com.deploydesexta.springsandbox.annotation;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AnnotationBeanConfig.class)
class AnnotationBeanConfig {

    @Bean
    @UserContext
    KeyValueClient userClient() {
        return new KeyValueClient("users", KeyValueClient.Configuration.with(1L, 2L));
    }

    @Bean
    @CreditCardContext
    KeyValueClient creditCardClient() {
        return new KeyValueClient("creditCards", KeyValueClient.Configuration.with(5L, 5L));
    }
}
