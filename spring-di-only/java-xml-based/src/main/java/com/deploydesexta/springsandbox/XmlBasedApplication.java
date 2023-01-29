package com.deploydesexta.springsandbox;

import com.deploydesexta.springsandbox.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedApplication {

    public static void main(String[] args) {
        final var start = System.currentTimeMillis();

        ApplicationContext context
                = new ClassPathXmlApplicationContext("application-context.xml");

        System.out.printf("Spring time: %d ms\n", System.currentTimeMillis() - start);

        UserService service = context.getBean(UserService.class);
        service.greetings();
    }
}