package com.deploydesexta.springsandbox.classes;

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
