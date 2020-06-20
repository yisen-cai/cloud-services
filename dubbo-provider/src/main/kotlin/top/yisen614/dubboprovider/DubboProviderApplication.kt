package top.yisen614.dubboprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication
//@ComponentScan(basePackages = ["top.yisen614.commons"])
//@ComponentScan(basePackages = "com.boot.demo.xxx..")用于扫描@Controller @Service
@EnableJpaRepositories(basePackages = ["top.yisen614.commons.repository"])
@EntityScan(basePackages = ["top.yisen614.commons.entity"])
class DubboProviderApplication

fun main(args: Array<String>) {
    runApplication<DubboProviderApplication>(*args)
}
