package com.app.micro.customerprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SprintBaseRootApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SprintBaseRootApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SprintBaseRootApplication.class);
    }

}
