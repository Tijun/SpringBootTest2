package com.test;

import com.app.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2016/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringControllerTester {

    @Autowired
    TestRestTemplate template;
    @Test
    public void test(){
        ResponseEntity<String> entity = template.getForEntity("http://localhost:8080/hello",String.class);
        System.out.println(entity.toString());

    }
}
