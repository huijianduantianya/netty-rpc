package com.jxufe.netty.rpc.consumer;

import com.jxufe.netty.rpc.api.IRpcHelloService;
import com.jxufe.netty.rpc.api.IRpcService;
import com.jxufe.netty.rpc.consumer.proxy.RpcProxy;

public class RpcConsumer {

    public static void main(String [] args){
        IRpcHelloService rpcHello = RpcProxy.create(IRpcHelloService.class);

        System.out.println(rpcHello.hello("挥剑断天涯"));

        IRpcService service = RpcProxy.create(IRpcService.class);

        System.out.println("10 + 2 = " + service.add(10, 2));
        System.out.println("10 - 2 = " + service.sub(10, 2));
        System.out.println("10 * 2 = " + service.mult(10, 2));
        System.out.println("10 / 2 = " + service.div(10, 2));
    }

}
