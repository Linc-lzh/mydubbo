package com.linc.consumer;
import com.linc.framework.ProxyFactory;
import com.linc.provider.api.HelloService;

public class Consumer {
    public static void main(String[] args) {

        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String result = helloService.sayHello("Linc test");

        System.out.println("test result="+ result);
    }
}
