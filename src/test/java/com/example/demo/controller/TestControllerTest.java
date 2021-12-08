package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TestControllerTest {

    /**
     * logger
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void hello_1() {
        assert 1 != 1;
        logger.info("hello_1 failure");
    }

    @Test
    public void hello_2() {
        assert 1 == 1;
        logger.info("hello_2 success");
    }

}