package top.yisen614.commons.entity

import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.Where
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*


@Entity
@Table(name = "t_user")
@Where(clause = "is_delete = 0 and is_active = 1")
@SQLDelete(sql = "update t_user set is_delete = 1 where pk_id = ?")
class UserEntity : AbstractSuperEntity, Serializable {

    constructor()

    constructor(id: Long) {
        this.id = id
    }

    @Column(nullable = false, columnDefinition = "varchar(20)")
    var username: String? = null

    @Column(nullable = false, columnDefinition = "TINYINT UNSIGNED DEFAULT 0")
    var age: Int? = null

    @Column(nullable = false, columnDefinition = "DATE NOT NULL")
    var birthday:LocalDate? = null

    @Column(nullable = false, columnDefinition = "varchar(100) default ''")
    var avatar: String? = null

    @Column(nullable = false, columnDefinition = "varchar(100)")
    var password: String? = null

    override fun toString(): String {
        return "UserEntity(id=$id, name=$username)"
    }
}