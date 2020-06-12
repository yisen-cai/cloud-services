package top.yisen614.microserver.controller

import org.apache.dubbo.config.annotation.DubboReference
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.yisen614.cloudcommons.entity.UserEntity
import top.yisen614.cloudcommons.service.UserService


@RestController
@RequestMapping("/users")
class UserController {


    @DubboReference(version = "0.0.1")
    private lateinit var userService: UserService

    @GetMapping
    fun getUsers():List<UserEntity> {
        return userService.getUsers()
    }
}