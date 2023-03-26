package com.linc.framework.protocol.http;

import com.linc.framework.Invoker;
import com.linc.framework.Protocol;
import com.linc.framework.URL;
import com.linc.framework.register.LocalRegister;
import com.linc.framework.register.RemoteMapRegister;

public class HttpProtocol implements Protocol {
    @Override
    public void export(URL url) {
        LocalRegister.regist(url.getInterfaceName(), url.getImplClass());
        RemoteMapRegister.regist(url.getInterfaceName(), url);
        new HttpServer().start(url.getHostname(), url.getPort());
    }

    @Override
    public Invoker refer(URL url) {
        return new HttpInvoker(url);
    }
}
