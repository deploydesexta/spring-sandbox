package com.deploydesexta.springsandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CreditCardService {

    @Autowired
    private SimpleKeyValueClient<CreditCard, Long> keyValueClient;

    public SimpleKeyValueClient<CreditCard, Long> getKeyValueClient() {
        return keyValueClient;
    }
}
