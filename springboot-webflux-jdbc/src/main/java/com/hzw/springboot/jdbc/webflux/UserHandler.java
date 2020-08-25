package com.hzw.springboot.jdbc.webflux;

import com.hzw.springboot.jdbc.entity.BankCustomerDO;
import com.hzw.springboot.jdbc.entity.User;
import com.hzw.springboot.jdbc.repository.BankCustomerMapper;
import com.hzw.springboot.jdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author: huangzuwang
 * @date: 2019-09-10 18:29
 * @description:
 */
@Component
public class UserHandler {

    private final UserRepository userRepository;

    @Autowired
    private BankCustomerMapper bankCustomerMapper;

    public UserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<ServerResponse> save(ServerRequest request){
        Mono<User> userMono = request.bodyToMono(User.class);
        System.out.printf(">>>>>>>>[%s] UserHandler Save User:[%s]\n",Thread.currentThread().getName(), userMono);
        Mono<Boolean> booleanMono = userMono.map(userRepository::save);
        return ServerResponse.ok().body(booleanMono, Boolean.class);
    }

    public Mono<ServerResponse> get(ServerRequest request){
        Mono<BankCustomerDO> bankMono = request.bodyToMono(BankCustomerDO.class);
        System.out.printf(">>>>>>>>[%s] UserHandler Get BankCustomerDO:[%s]\n",Thread.currentThread().getName(), bankMono);
        Mono<BankCustomerDO> booleanMono = bankMono.map(bankCustomerMapper::selectByPrimaryKey);
        return ServerResponse.ok().body(booleanMono, BankCustomerDO.class);
    }
}
