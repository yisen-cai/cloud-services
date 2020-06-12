package top.yisen614.microserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroServerApplication

fun main(args: Array<String>) {
    runApplication<MicroServerApplication>(*args)
}
