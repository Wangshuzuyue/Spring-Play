package com.hzw.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 审核表
 * </p>
 *
 * @author ${author}
 * @since 2019-12-03
 */
@Data
@Accessors(chain = true)
@TableName("risk_check")
public class RiskCheckDO implements Serializable {

    private static final long serialVersionUID = 1L;

//    @TableId(value = "name", type = IdType.AUTO)
    private Long id;

    private String checkCode;

    /**
     * 风控结果 0未通过 1通过
     */
    private String checkResult;

    private LocalDateTime checkTime;

    private LocalDateTime resultTime;

    private Long identityId;

    private String describe;

    private String checkState;


}
