package com.deploydesexta.springsandbox

import com.deploydesexta.springsandbox.repositories.GetUser
import com.deploydesexta.springsandbox.repositories.UserDAO
import com.deploydesexta.springsandbox.services.UserService
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

fun main() {
    val start = System.currentTimeMillis()

    val context = AnnotationConfigApplicationContext(AppConfig::class.java)

    System.out.printf("Spring time: %d ms\n", System.currentTimeMillis() - start)

    val service = context.getBean(UserService::class.java)
    service.greetings()
}

@Configuration
@ComponentScan(basePackageClasses = [AppConfig::class])
class AppConfig {

    @Bean
    fun getUser(dao: UserDAO): GetUser = dao::get

}