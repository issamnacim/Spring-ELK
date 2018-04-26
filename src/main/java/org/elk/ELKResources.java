package org.elk;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by issam on 4/25/18.
 */
@RestController
class ELKResources {
    private static final Logger LOG = Logger.getLogger(ELKResources.class.getName());

    @RequestMapping(value = "/ElkWelcome")
    public String helloWorld() {
        String welcome = "Welcome to ELK with Spring Boot by Nacim Issam";
        LOG.log(Level.INFO, welcome);

        return welcome;
    }
}