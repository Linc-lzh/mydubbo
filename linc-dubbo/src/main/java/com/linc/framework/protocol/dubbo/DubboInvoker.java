package com.linc.framework.protocol.dubbo;

import com.linc.framework.Invocation;
import com.linc.framework.Invoker;
import com.linc.framework.URL;

public class DubboInvoker implements Invoker {
    private  URL url;

    public DubboInvoker(URL url){
        this.url = url;
    }

    @Override
    public String invoke(Invocation invocation) {
        return new NettyClient<>().send(url.getHostname(), url.getPort(), invocation);
    }
}
