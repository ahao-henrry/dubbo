package com.ahao.dubbo.consumer.test;

import com.ahao.dubbo.bean.DogVO;
import com.ahao.dubbo.bean.UserVO;
import com.ahao.dubbo.consumer.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @author ahao
 * @since 2019/9/15 下午10:59
 */
public class ConsumerTest {

    @Test
    public void testConsumer() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        IUserService iUserService = context.getBean(IUserService.class);
        UserVO user = iUserService.getById(1);
        System.out.println(user.toString());

        List<DogVO> dogs = user.getDogs();
        dogs.forEach(dogVO -> System.out.println(dogVO.toString()));

        System.in.read();
    }

}
