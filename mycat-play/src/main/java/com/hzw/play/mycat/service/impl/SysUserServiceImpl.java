package com.hzw.play.mycat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzw.play.mycat.datasource.DynamicDataSourceConfig;
import com.hzw.play.mycat.datasource.TargetDataSource;
import com.hzw.play.mycat.entity.SysUser;
import com.hzw.play.mycat.mapper.SysUserMapper;
import com.hzw.play.mycat.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @TargetDataSource(name = DynamicDataSourceConfig.SECOND_NAME)
    @Override
    public SysUser findUserBySecondDb(long id) {
        SysUser sysUser = this.baseMapper.selectById(id);
        return sysUser;
    }

}
