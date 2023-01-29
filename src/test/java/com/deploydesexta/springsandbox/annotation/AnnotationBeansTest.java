package com.deploydesexta.springsandbox.annotation;

import com.deploydesexta.springsandbox.KeyValueClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AnnotationBeanConfig.class)
class AnnotationBeansTest {

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
