package top.yisen614.commons.service

import top.yisen614.commons.vo.CreateUserVO
import top.yisen614.commons.entity.UserEntity


interface UserService {
    fun getUsers(): List<UserEntity>

    fun createUser(createUserVO: CreateUserVO): Boolean
}