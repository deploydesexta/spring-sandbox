package com.deploydesexta.springsandbox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ClassesBeanConfig.class)
class ClassesBeanConfig {

    @Bean
    UserKeyValueClient userClient() {
        return new UserKeyValueClient(
                new KeyValueClient("users", KeyValueClient.Configuration.with(1L, 2L))
        );
    }

    @Bean
    CreditCardKeyValueClient creditCardClient() {
        return new CreditCardKeyValueClient(
                new KeyValueClient("creditCards", KeyValueClient.Configuration.with(5L, 5L))
        );
    }
}
