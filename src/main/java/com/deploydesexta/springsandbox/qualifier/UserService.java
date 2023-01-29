package com.deploydesexta.springsandbox.qualifier;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.deploydesexta.springsandbox.qualifier.QualifierBeanConfig.USER_CLIENT;

@Component
class UserService {

    @Autowired
    @Qualifier(USER_CLIENT)
    private KeyValueClient keyValueClient;

    public KeyValueClient getKeyValueClient() {
        return keyValueClient;
    }
}
