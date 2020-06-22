package top.yisen614.microserver.controller

import org.apache.dubbo.config.annotation.DubboReference
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import top.yisen614.commons.vo.CreateUserVO
import top.yisen614.commons.entity.UserEntity
import top.yisen614.commons.service.UserService
import javax.validation.Valid


@RestController
@RequestMapping("/users")
class UserController {


    @DubboReference(version = "0.0.1")
    private lateinit var userService: UserService

    @GetMapping
    fun getUsers(): List<UserEntity> {
        return userService.getUsers()
    }

    @PostMapping()
    fun createUser(@Valid @RequestBody userVO: CreateUserVO, result: BindingResult): Boolean {
        if (result.hasErrors()) {
            return false;
        }
        return userService.createUser(userVO)
    }
}