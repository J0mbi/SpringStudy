package dev.jombi.springtest.repositories

import dev.jombi.springtest.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun existsByUsername(username: String): Boolean
    fun findUserByUsername(username: String): User?
}