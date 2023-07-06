package team.flint.tree.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import team.flint.example.kit.utils.ServletUtils;
import team.flint.example.model.req.RegisterReq;
import team.flint.example.model.vo.UserInfoVo;
import com.flint.parent.code.StatusCodeKit;
import com.flint.parent.exception.ClientException;

/**
 * 案例模块
 */
@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    /**
     * 获取用户详情
     * @return 名字
     */
    @GetMapping("/getUserInfo")
    public String getUserInfo(Long userId) {
        return "userId = " + userId;
    }

    /**
     * 注册用户
     * @param query
     * @return 用户ID
     */
    @PostMapping("/register")
    public UserInfoVo register(@RequestBody @Validated RegisterReq query) {
        log.info("query {}", query.mobile);
        if (1==1) {
            throw new ClientException("我是错误");
        }
        UserInfoVo vo = new UserInfoVo();
        vo.setName("黄磊");
        vo.setAge(42);
        return vo;
    }

    @PostMapping("/token")
    public UserInfoVo token(@RequestBody @Validated RegisterReq query) {
//        com.flint.parent.utils.JwtKit.isToken();
//        log.info("query {}", query.mobile);
        if (1==1) {
            throw new ClientException(StatusCodeKit.buildClient("1000"));
        }
//        log.info("userId:{}",ServletUtils.getRequestAttributes().getAttribute("userId", 0));
        UserInfoVo vo = new UserInfoVo();
        vo.setName("黄磊");
        vo.setAge(42);
        return vo;
    }


    @PostMapping("/token/method")
    public UserInfoVo tokenMethod(@RequestBody @Validated RegisterReq query) {



        // 抛出异常
//        throw new ClientException("错我");
        // 异常数据
        // 国际化


//        com.flint.parent.utils.JwtKit.isToken();
        UserInfoVo vo = new UserInfoVo();
        vo.setName("黄磊");
        vo.setAge(42);
        return vo;
    }
}
