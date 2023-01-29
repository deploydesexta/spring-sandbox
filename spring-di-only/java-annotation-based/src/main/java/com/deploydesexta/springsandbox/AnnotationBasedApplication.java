package com.deploydesexta.springsandbox;

import com.deploydesexta.springsandbox.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedApplication {

    public static void main(String[] args) {
        final var start = System.currentTimeMillis();

        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.printf("Spring time: %d ms\n", System.currentTimeMillis() - start);

        UserService service = context.getBean(UserService.class);
        service.greetings();
    }
}
