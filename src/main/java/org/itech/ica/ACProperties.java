package org.itech.ica;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ACConfiguration
 *
 * @author liu qiang
 */
@Data
@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "ac")
public class ACProperties {
    private String greeting;
    private String farewell;
}
