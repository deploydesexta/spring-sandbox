package com.deploydesexta.springsandbox.annotation;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UserService {

    @Autowired
    @UserContext
    private KeyValueClient keyValueClient;

    KeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
