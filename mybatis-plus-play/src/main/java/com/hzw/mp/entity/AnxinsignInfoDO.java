package com.hzw.mp.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 安心签账户信息
 * </p>
 *
 * @author ${author}
 * @since 2019-12-02
 */
@Data
@Accessors(chain = true)
@TableName("anxinsign_info")
public class AnxinsignInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安心签用户ID
     */
    private String anxinUserid;

    private Long identityId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 是否绑定了证书
     */
    private String isBindCert;

    private Integer userId;


}
