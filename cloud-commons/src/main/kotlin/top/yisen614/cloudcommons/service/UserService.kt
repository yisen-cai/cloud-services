package top.yisen614.cloudcommons.service

import top.yisen614.cloudcommons.entity.UserEntity


interface UserService {
    fun getUsers():List<UserEntity>
}