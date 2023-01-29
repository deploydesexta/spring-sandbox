package com.deploydesexta.springsandbox;

import com.deploydesexta.springsandbox.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UserService {

    @Autowired
    private SimpleKeyValueClient<User, String> keyValueClient;

    public SimpleKeyValueClient<User, String> getKeyValueClient() {
        return keyValueClient;
    }
}
