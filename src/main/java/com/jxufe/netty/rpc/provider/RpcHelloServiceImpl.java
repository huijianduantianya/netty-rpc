package com.jxufe.netty.rpc.provider;

import com.jxufe.netty.rpc.api.IRpcHelloService;

public class RpcHelloServiceImpl implements IRpcHelloService {
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
