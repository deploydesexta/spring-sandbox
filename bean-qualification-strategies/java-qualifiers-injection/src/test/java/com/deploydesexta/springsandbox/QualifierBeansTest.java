package com.deploydesexta.springsandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = QualifierBeanConfig.class)
class QualifierBeansTest {

    @Autowired
    private CreditCardService creditCardService;

    @Autowired
    private UserService userService;

    @Test
    public void testServicesHasDifferentInstances() {
        KeyValueClient ccKV = creditCardService.getKeyValueClient();
        Assertions.assertEquals("creditCards", ccKV.getName());

        KeyValueClient uKV = userService.getKeyValueClient();
        Assertions.assertEquals("users", uKV.getName());
    }
}
