package tech.hutu.system.api;

import tech.hutu.system.api.pojo.SysUserDTO;

public interface SysUserApi {

    SysUserDTO getSysUserByUserId(Long userId);

}
