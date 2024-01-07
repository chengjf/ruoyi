package tech.hutu.system.convertor;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tech.hutu.system.api.pojo.SysUserDTO;
import tech.hutu.system.dto.SysUser;

@Mapper
public interface SysUserConvertor {
    SysUserConvertor INSTANCE = Mappers.getMapper(SysUserConvertor.class);

    SysUserDTO convert(SysUser sysUser);
}
