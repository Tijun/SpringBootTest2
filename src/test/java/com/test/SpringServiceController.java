package com.test;

import com.app.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2016/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringServiceController {
    @Autowired

    @Test
    public void testHello(){

    }
}
