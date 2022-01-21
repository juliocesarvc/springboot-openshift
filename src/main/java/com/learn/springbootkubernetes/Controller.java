package com.learn.springbootkubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${example.property.1}")
    private String exampleProperty1;

    @Value("${example.property.2}")
    private String exampleProperty2;


    @Value("${property.1}")
    private String property1;

    @Value("${property.2}")
    private String property2;

    @Value("${property.3}")
    private String property3;


    @Autowired
    private MyConfig myConfig;



    @RequestMapping("/")
    public String index() {
        return "Hello Spring-Boot app successfully deployed and running on Minishift |"
            + exampleProperty1 + "|" + exampleProperty2
            + "|||" + property1 + "|" + property2 + "|" + property3
            + "|||" + myConfig.getProperty1()
            ;
    }
}
