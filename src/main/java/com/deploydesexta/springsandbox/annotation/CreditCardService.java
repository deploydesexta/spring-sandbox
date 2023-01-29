package com.deploydesexta.springsandbox.annotation;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CreditCardService {

    @Autowired
    @CreditCardContext
    KeyValueClient keyValueClient;

    KeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
