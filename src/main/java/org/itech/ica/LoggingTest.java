package org.itech.ica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LoggingTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggingTest.class);

    @Scheduled(fixedDelay = 10000)
    public void logException() {
        logger.info("start exception");

        throw new RuntimeException("logging exception");
    }
}
