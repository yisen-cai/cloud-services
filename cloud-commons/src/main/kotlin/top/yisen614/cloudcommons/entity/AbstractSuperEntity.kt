package top.yisen614.cloudcommons.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

/**
 * Jpa实体通用抽象父类
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class AbstractSuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(columnDefinition = "TINYINT UNSIGNED DEFAULT 0")
    var isDelete: Boolean = false

    @Column(columnDefinition = "TINYINT UNSIGNED DEFAULT 1")
    var isActive: Boolean = true

    @CreatedDate
    @Column(nullable = false)
    var createTime: LocalDateTime? = null

    @LastModifiedDate
    @Column(nullable = false)
    var updateTime: LocalDateTime? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (this.id == null || other == null || this.javaClass != other.javaClass) {
            return false
        }

        val that = other as AbstractSuperEntity?
        return this.id == that!!.id
    }

    override fun hashCode(): Int {
        return if (this.id == null) 0 else this.id!!.hashCode()
    }
}
