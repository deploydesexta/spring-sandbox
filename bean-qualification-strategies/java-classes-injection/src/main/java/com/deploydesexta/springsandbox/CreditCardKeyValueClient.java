package com.deploydesexta.springsandbox;

class CreditCardKeyValueClient
        extends SimpleKeyValueClient<CreditCard, Long> {

    public CreditCardKeyValueClient(
            final KeyValueClient client
    ) {
        super(CreditCard.class, client);
    }
}
