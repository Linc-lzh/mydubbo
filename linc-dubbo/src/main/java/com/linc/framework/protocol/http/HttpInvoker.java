package com.linc.framework.protocol.http;


import com.linc.framework.Invocation;
import com.linc.framework.Invoker;
import com.linc.framework.URL;

import java.io.IOException;

public class HttpInvoker implements Invoker {

    private URL url;

    public HttpInvoker(URL url) {
        this.url = url;
    }

    @Override
    public String invoke(Invocation invocation) {
        try {
            return new HttpClient().send(url.getHostname(), url.getPort(),invocation);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
