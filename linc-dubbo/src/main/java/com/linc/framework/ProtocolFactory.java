package com.linc.framework;

import com.linc.framework.protocol.dubbo.DubboProtocol;
import com.linc.framework.protocol.http.HttpProtocol;

public class ProtocolFactory {
    public static Protocol getProtocol(String name) {

        switch (name) {
            case "http":
                return new HttpProtocol();
            case "dubbo":
                return new DubboProtocol();
            default:
                break;
        }

        return new HttpProtocol();
    }
}
