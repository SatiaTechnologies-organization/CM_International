package com.dode.cminternational;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmInternationalApplication {
    public static void main(String[] args) {
        var app = new SpringApplication(CmInternationalApplication.class);
        app.setBannerMode(Banner.Mode.OFF);      // skip ASCII art banner
        app.setLogStartupInfo(false);            // skip 5 lines of log
        app.run(args);
    }
}
