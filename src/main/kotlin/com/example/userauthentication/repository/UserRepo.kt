package com.example.userauthentication.repository

import com.example.userauthentication.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<User, Int> {
}