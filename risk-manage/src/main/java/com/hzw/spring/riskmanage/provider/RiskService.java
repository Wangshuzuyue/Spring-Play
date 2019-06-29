package com.hzw.spring.riskmanage.provider;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/16 20:29
 * @Description:
 */
public interface RiskService {

    Integer getRiskCount(String fundParty, String assetFrom);
}
