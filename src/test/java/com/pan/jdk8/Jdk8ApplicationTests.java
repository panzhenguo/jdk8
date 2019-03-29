package com.pan.jdk8;

import com.pan.jdk8.collectors.ListTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jdk8ApplicationTests {



    @Mock
    private ListTest listTest;


    @Test
    public void contextLoads() {
        doReturn(1).when(listTest).t(anyInt());
        listTest.t(11);
        Assert.assertNotNull(listTest.t(11));
    }



}
