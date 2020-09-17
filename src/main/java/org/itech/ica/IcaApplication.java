package org.itech.ica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * IcaApplication
 *
 * @author liu qiang
 */
@EnableScheduling
@SpringBootApplication
public class IcaApplication {
    public static void main(String[] args) {
        SpringApplication.run(IcaApplication.class, args);
    }
}
