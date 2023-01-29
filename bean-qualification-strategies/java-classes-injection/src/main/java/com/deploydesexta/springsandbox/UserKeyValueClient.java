package com.deploydesexta.springsandbox;

class UserKeyValueClient
        extends SimpleKeyValueClient<User, Long> {

    public UserKeyValueClient(
            final KeyValueClient client
    ) {
        super(User.class, client);
    }
}
