package com.deploydesexta.springsandbox.generics;

import com.deploydesexta.springsandbox.CreditCard;
import com.deploydesexta.springsandbox.KeyValueClient;
import com.deploydesexta.springsandbox.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = GenericsBeanConfig.class)
class GenericsBeanConfig {

    @Bean
    SimpleKeyValueClient<User, String> userClient() {
        return new SimpleKeyValueClient<>(
                User.class,
                new KeyValueClient("users", KeyValueClient.Configuration.with(1L, 2L))
        );
    }

    @Bean
    SimpleKeyValueClient<CreditCard, Long> creditCardClient() {
        return new SimpleKeyValueClient<>(
                CreditCard.class,
                new KeyValueClient("creditCards", KeyValueClient.Configuration.with(5L, 5L))
        );
    }
}
