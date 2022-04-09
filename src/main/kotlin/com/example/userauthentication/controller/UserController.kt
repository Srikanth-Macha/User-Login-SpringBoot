package com.example.userauthentication.controller

import com.example.userauthentication.models.User
import com.example.userauthentication.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/users")
    fun getAllUsers(): List<User> = userService.getUsers()

    @PostMapping("/save")
    fun saveUser(@RequestBody user: User): User = userService.saveUser(user)

    @PutMapping("/find_user")
    fun findUserByUsername(@RequestBody user: User): User? = userService.findByUsername(user)
}