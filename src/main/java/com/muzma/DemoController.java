package com.muzma;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 12032146 on 12/9/2016.
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String hello(){
        return "Haii";
    }
}
