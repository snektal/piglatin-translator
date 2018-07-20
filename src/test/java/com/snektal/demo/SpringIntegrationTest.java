package com.snektal.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringIntegrationTest {
    private static Logger log = LoggerFactory.getLogger(SpringIntegrationTest.class);

    protected TestRestTemplate restTemplate;

    @Test
    public void noop() {
        log.info("*** noop");
    }

}
