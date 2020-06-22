package top.yisen614.microserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DubboConsumerApplication

fun main(args: Array<String>) {
    runApplication<DubboConsumerApplication>(*args)
}
