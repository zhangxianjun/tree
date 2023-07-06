package team.flint.tree.model.req;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * 注册用户
 */
@Getter
@Setter
public class RegisterReq {

    /**
     * 用户手机号
     */
    @NotNull(message = "手机号不能为空")
    public String mobile;
    /**
     * 验证码
     */
    @NotNull(message = "验证码不能为空")
    public String validCode;

    /**
     * 邀请码
     */
    public String invitationCode;
}
