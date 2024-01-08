package tech.hutu.system.service.impl;

import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import tech.hutu.system.api.SysUserApi;
import tech.hutu.system.api.pojo.SysUserDTO;
import tech.hutu.system.convertor.SysUserConvertor;
import tech.hutu.system.dto.SysUser;
import tech.hutu.system.mapper.SysUser2Mapper;
import tech.hutu.system.mapper.SysUserMapper;

@RequiredArgsConstructor
@Service
@DubboService
public class SysUserApiImpl implements SysUserApi {

    private final SysUserMapper sysUserMapper;

    private final SysUser2Mapper sysUser2Mapper;

    @Override
    public SysUserDTO getSysUserByUserId(Long userId) {
        SysUser sysUser = sysUserMapper.selectById(userId);
        return SysUserConvertor.INSTANCE.convert(sysUser);
    }

}
