package top.yisen614.configserver.actuator

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.ReactiveHealthIndicator
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class DownstreamServiceHealthIndicator:ReactiveHealthIndicator {

    override fun health(): Mono<Health> {
        return checkDownstreamServiceHealth().onErrorResume {
            Mono.just(Health.down().build())
        }
    }


    fun checkDownstreamServiceHealth():Mono<Health> {
        // use webclient to check health reactively
        return Mono.just(Health.up().build())
    }
}