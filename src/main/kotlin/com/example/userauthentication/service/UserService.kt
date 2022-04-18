package com.example.userauthentication.service

import com.example.userauthentication.models.User
import com.example.userauthentication.repository.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepo: UserRepo

    fun saveUser(user: User): User = userRepo.save(user)

    fun getUsers(): List<User> = userRepo.findAll()

    fun findByUsername(requestUser: User): User? {
        val usersList: List<User> = getUsers()

        for (user in usersList)
            if (user.username == requestUser.username && user.password == requestUser.password)
                return user

        return null
    }

}