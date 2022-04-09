package com.example.userauthentication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserAuthenticationApplication

fun main(args: Array<String>) {
    runApplication<UserAuthenticationApplication>(*args)
}
