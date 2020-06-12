package top.yisen614.dubboprovider.service

import org.apache.dubbo.config.annotation.DubboService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import top.yisen614.cloudcommons.entity.UserEntity
import top.yisen614.cloudcommons.repository.UserRepository
import top.yisen614.cloudcommons.service.UserService


@Component
@DubboService(version = "0.0.1")
class UserServiceImpl:UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun getUsers(): List<UserEntity> {
        return userRepository.findAll()
    }

}