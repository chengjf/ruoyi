package tech.hutu.admin.rest.controller;

import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.hutu.system.api.SysUserApi;
import tech.hutu.system.api.pojo.SysUserDTO;


@RestController
public class TestController {

    @DubboReference(check = false)
    private SysUserApi sysUserApi;


    @GetMapping("hello/{userId}")
    public SysUserDTO hello(@PathVariable("userId") Long userId) {
        return sysUserApi.getSysUserByUserId(userId);
    }

}
