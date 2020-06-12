package top.yisen614.cloudcommons.repository

import org.springframework.data.jpa.repository.JpaRepository
import top.yisen614.cloudcommons.entity.UserEntity

interface UserRepository : JpaRepository<UserEntity, Long> {
    override fun findAll(): List<UserEntity>
}