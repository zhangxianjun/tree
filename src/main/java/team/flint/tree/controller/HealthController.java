package team.flint.tree.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/fw")
public class HealthController {
    /**
     * 健康检查：HTTP状态为200，程序启动正常。
     */
    @RequestMapping(value = "/checkHealth", method = RequestMethod.HEAD)
    public String checkHealth() {
        return "OK";
    }
}
