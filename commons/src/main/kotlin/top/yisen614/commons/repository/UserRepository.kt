package top.yisen614.commons.repository

import org.springframework.data.jpa.repository.JpaRepository
import top.yisen614.commons.entity.UserEntity

interface UserRepository : JpaRepository<UserEntity, Long> {
    override fun findAll(): List<UserEntity>
}