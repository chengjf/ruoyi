package tech.hutu.admin.rest.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.hutu.system.api.SysUserApi;
import tech.hutu.system.api.pojo.SysUserDTO;


@RestController
public class TestController {

    @SofaReference(interfaceType = SysUserApi.class, uniqueId = "sys-user-api",jvmFirst = false, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private SysUserApi sysUserApi;


    @GetMapping("hello/{userId}")
    public SysUserDTO hello(@PathVariable("userId") Long userId) {
        return sysUserApi.getSysUserByUserId(userId);
    }

}
