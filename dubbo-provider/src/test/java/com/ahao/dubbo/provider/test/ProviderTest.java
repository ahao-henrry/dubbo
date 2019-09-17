package com.ahao.dubbo.provider.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author ahao
 * @since 2019/9/15 下午10:42
 */

public class ProviderTest {

    @Test
    public void providerTest() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        System.in.read();
    }
}
