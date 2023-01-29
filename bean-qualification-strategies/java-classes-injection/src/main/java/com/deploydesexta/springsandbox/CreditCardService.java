package com.deploydesexta.springsandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CreditCardService {

    @Autowired
    private CreditCardKeyValueClient keyValueClient;

    public CreditCardKeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
