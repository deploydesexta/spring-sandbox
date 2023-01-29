package com.deploydesexta.springsandbox.repositories

import com.deploydesexta.springsandbox.User
import org.springframework.stereotype.Component

@Component
class UserDAO {

    fun get(id: Long): User {
        return User(name = "deploydesexta")
    }
}
