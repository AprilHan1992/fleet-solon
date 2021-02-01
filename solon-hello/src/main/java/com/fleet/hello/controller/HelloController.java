package com.fleet.hello.controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;

/**
 * @author April Han
 */
@Controller
public class HelloController {

    @Mapping("/hello")
    public String hello() {
        return "hello world";
    }
}
