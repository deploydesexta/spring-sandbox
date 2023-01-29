package com.deploydesexta.springsandbox;

import java.io.Serializable;

class SimpleKeyValueClient<T, ID extends Serializable> {

    private final Class<T> domainClass;
    private final KeyValueClient client;

    public SimpleKeyValueClient(
            final Class<T> domainClass,
            final KeyValueClient client
    ) {
        this.domainClass = domainClass;
        this.client = client;
    }

    public String getName() {
        return this.client.getName();
    }

    Result<T> create(final Object data) {
        return null;
    }

    T get(final ID id) {
        return null;
    }

    public record Result<T>(T data) {

    }
}
