package com.deploydesexta.springsandbox.primary;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UserService {

    @Autowired
    private KeyValueClient keyValueClient;

    public KeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
