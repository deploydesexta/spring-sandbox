package com.deploydesexta.springsandbox.classes;

import com.deploydesexta.springsandbox.CreditCard;
import com.deploydesexta.springsandbox.KeyValueClient;

class CreditCardKeyValueClient
        extends SimpleKeyValueClient<CreditCard, Long> {

    public CreditCardKeyValueClient(
            final KeyValueClient client
    ) {
        super(CreditCard.class, client);
    }
}
