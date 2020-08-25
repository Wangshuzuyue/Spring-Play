package com.hzw.spring.usermanage.zookeeper.comsumer;

import lombok.Data;

import java.util.Objects;

/**
 * @author: huangzuwang
 * @date: 2019-07-23 11:33
 * @description:
 */
@Data
public class RegisterInfo {

    String ip;

    Integer port;

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        RegisterInfo that = (RegisterInfo) o;
        return ip.equals(that.ip) &&
                port.equals(that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, port);
    }
}
