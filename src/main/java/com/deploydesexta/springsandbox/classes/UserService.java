package com.deploydesexta.springsandbox.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UserService {

    @Autowired
    private UserKeyValueClient keyValueClient;

    public UserKeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
