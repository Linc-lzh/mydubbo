package com.linc.provider.impl;

import com.linc.provider.api.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String userName) {
        return "Hello:" + userName;
    }
}
