package tech.hutu.system.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import tech.hutu.system.dto.SysUser;


@DS("master")
public interface SysUserMapper extends BaseMapper<SysUser> {
}
