package com.example.userauthentication.service

import com.example.userauthentication.models.User
import com.example.userauthentication.repository.UserRepo
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    private val logger: Logger = LoggerFactory.getLogger(UserService::class.java)

    @Autowired
    private lateinit var userRepo: UserRepo

    fun saveUser(user: User): User = userRepo.save(user)

    fun getUsers(): List<User> = userRepo.findAll()

    fun findByUsername(requestUser: User): User? {
        val username = requestUser.username
        val usersList: List<User> = getUsers()

        for (user in usersList)
            if (user.username == username)
                return user

        return null
    }

}