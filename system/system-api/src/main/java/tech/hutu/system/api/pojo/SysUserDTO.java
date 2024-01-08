package tech.hutu.system.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUserDTO implements Serializable {

    private static final long serialVersionUID = 3322718097195956949L;

    private Long userId;

    private String userName;
}
