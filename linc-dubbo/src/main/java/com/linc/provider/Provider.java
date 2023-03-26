package com.linc.provider;

import com.linc.framework.Protocol;
import com.linc.framework.ProtocolFactory;
import com.linc.framework.URL;
import com.linc.provider.api.HelloService;
import com.linc.provider.impl.HelloServiceImpl;

public class Provider {
    public static void main(String[] args) {
        String protocolName = getProtocol();
        URL url = new URL(protocolName, "localhost", 8081, HelloService.class.getName(), HelloServiceImpl.class);
        Protocol protocol = ProtocolFactory.getProtocol(protocolName);
        protocol.export(url);
    }

    public static String getProtocol() {
        String protocolName = System.getProperty("protocolName");
        if (protocolName == null)
            return "http";
        return protocolName;
    }
}
