package com.deploydesexta.springsandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ClassesBeanConfig.class)
class ClassesBeansTest {

    @Autowired
    private CreditCardService creditCardService;

    @Autowired
    private UserService userService;

    @Test
    public void testServicesHasDifferentInstances() {
        SimpleKeyValueClient ccKV = creditCardService.getKeyValueClient();
        Assertions.assertEquals("creditCards", ccKV.getName());

        SimpleKeyValueClient uKV = userService.getKeyValueClient();
        Assertions.assertEquals("users", uKV.getName());
    }
}
