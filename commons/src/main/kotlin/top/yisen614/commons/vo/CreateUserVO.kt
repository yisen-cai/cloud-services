package top.yisen614.commons.vo

import java.io.Serializable
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class CreateUserVO : Serializable {

    @NotBlank(message = "用户名不可为空")
    var username:String? = null

    @NotBlank(message = "用户头像不可为空")
    var avatar:String? = null

    @NotNull(message = "用户出生日期不可为空")
    var birthday: Long? = null

    @NotBlank(message = "用户密码不可为空")
    var password: String? = null
}