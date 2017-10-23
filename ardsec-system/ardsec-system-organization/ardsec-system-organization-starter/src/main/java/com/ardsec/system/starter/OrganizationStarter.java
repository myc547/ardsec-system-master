package com.ardsec.system.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version  1.0, 2017/10/20
 * @author myc
 */
@SpringBootApplication
@ComponentScan("com.ardsec")
public class OrganizationStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OrganizationStarter.class, args);
    }
}
