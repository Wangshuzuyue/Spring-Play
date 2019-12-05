package com.hzw.mp.mapper;

import com.hzw.mp.entity.RiskRuleResultDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2019-12-05
 */
public interface RiskRuleResultMapper extends BaseMapper<RiskRuleResultDO> {

    RiskRuleResultDO getMyOne(@Param("id")String id);
}
