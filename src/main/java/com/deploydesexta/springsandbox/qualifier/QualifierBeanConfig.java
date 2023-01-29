package com.deploydesexta.springsandbox.qualifier;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = QualifierBeanConfig.class)
class QualifierBeanConfig {

    public static final String CREDIT_CARD_CLIENT = "userClient";
    public static final String USER_CLIENT = "creditCardClient";

    @Bean(name = USER_CLIENT)
    public KeyValueClient userClient() {
        return new KeyValueClient("users", KeyValueClient.Configuration.with(1L, 2L));
    }

    @Bean(name = CREDIT_CARD_CLIENT)
    public KeyValueClient creditCardClient() {
        return new KeyValueClient("creditCards", KeyValueClient.Configuration.with(5L, 5L));
    }
}
