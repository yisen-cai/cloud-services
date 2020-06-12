package top.yisen614.cloudcommons.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class People : Serializable {
    // 人员编号
    @Id
    var id:Long? = null

    // 姓名
    var name: String? = null
}
