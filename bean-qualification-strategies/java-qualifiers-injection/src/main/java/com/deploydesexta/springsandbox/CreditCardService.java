package com.deploydesexta.springsandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.deploydesexta.springsandbox.QualifierBeanConfig.CREDIT_CARD_CLIENT;

@Component
class CreditCardService {

    @Autowired
    @Qualifier(CREDIT_CARD_CLIENT)
    private KeyValueClient keyValueClient;

    public KeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
