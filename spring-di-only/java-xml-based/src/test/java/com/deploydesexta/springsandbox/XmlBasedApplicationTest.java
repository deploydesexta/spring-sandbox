package com.deploydesexta.springsandbox;

import com.deploydesexta.springsandbox.services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedApplicationTest {

    @Test
    public void testSetUpSpringApplicationContextViaAnnotations() {
        final var start = System.currentTimeMillis();

        ApplicationContext context
                = new ClassPathXmlApplicationContext("application-context.xml");

        System.out.printf("Spring time: %d ms\n", System.currentTimeMillis() - start);

        UserService service = context.getBean(UserService.class);
        Assertions.assertNotNull(service);

        service.greetings();
    }
}
