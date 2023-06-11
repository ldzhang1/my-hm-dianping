package com.hmdp;

import com.hmdp.service.impl.ShopServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = {HmDianPingApplication.class})
@RunWith(SpringRunner.class)

public class HmDianPingApplicationTests {

    @Autowired
    private ShopServiceImpl shopService;

    @Test
    public void testSaveShop() throws InterruptedException {
        shopService.saveShop2Redis(1L, 10L);
    }
}