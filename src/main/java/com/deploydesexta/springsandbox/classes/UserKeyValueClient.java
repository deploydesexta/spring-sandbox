package com.deploydesexta.springsandbox.classes;

import com.deploydesexta.springsandbox.KeyValueClient;
import com.deploydesexta.springsandbox.User;

class UserKeyValueClient
        extends SimpleKeyValueClient<User, Long> {

    public UserKeyValueClient(
            final KeyValueClient client
    ) {
        super(User.class, client);
    }
}
