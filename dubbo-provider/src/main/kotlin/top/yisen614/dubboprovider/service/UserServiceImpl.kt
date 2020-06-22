package top.yisen614.dubboprovider.service

import org.apache.dubbo.config.annotation.DubboService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import top.yisen614.commons.vo.CreateUserVO
import top.yisen614.commons.entity.UserEntity
import top.yisen614.commons.repository.UserRepository
import top.yisen614.commons.service.UserService
import java.sql.Date

@Component
@DubboService(version = "0.0.1")
class UserServiceImpl : UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun getUsers(): List<UserEntity> {
        return userRepository.findAll()
    }

    override fun createUser(createUserVO: CreateUserVO): Boolean {
        val userEntity = UserEntity()
        userEntity.username = createUserVO.username
        userEntity.avatar = createUserVO.avatar
        userEntity.birthday = Date(createUserVO.birthday!!)
        userEntity.password = createUserVO.password
        userRepository.save(userEntity)
        if (userEntity.id > 0) {
            return true
        }
        return false
    }


}