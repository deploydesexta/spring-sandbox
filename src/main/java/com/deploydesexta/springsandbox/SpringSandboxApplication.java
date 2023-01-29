package com.deploydesexta.springsandbox;

import com.deploydesexta.springsandbox.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSandboxApplication {

    public static void main(String[] args) {
        annotationApplicationContext();
    }

    private static void annotationApplicationContext() {
        final var start = System.currentTimeMillis();

        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.printf("Spring time: %d ms\n", System.currentTimeMillis() - start);

        UserService service = context.getBean(UserService.class);
        service.greetings();
    }

    private static void xmlApplicationContext() {
        final var start = System.currentTimeMillis();

        ApplicationContext context
                = new ClassPathXmlApplicationContext("application-context.xml");

        System.out.printf("Spring time: %d ms\n", System.currentTimeMillis() - start);

        UserService service = context.getBean(UserService.class);
        service.greetings();
    }
}
