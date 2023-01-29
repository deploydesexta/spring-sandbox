package com.deploydesexta.springsandbox.services

import com.deploydesexta.springsandbox.repositories.GetUser
import org.springframework.stereotype.Service

@Service
class UserService(
    private val getUser: GetUser,
) {

    fun greetings() {
        val user = getUser(1L)
        println("HELLO ${user.name}")
    }
}
