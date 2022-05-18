package com.alipay.sofa.springbootarkbiz;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller("demoController2")
public class DemoController implements InitializingBean {
    private static ExecutorService executorService = Executors.newFixedThreadPool(1);

    @RequestMapping(value = "/test3")
    @ResponseBody
    private void metrics(HttpServletResponse response) throws IOException {
        StringWriter writer = new StringWriter();
        response.setHeader("Content-Type", "text/plain; version=0.0.4; charset=utf-8");
        writer.append("hello world 3!");
        executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println(11);
                return null;
            }
        });
        response.getOutputStream().print(writer.toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
