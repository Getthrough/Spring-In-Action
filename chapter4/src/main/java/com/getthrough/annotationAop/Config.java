package com.getthrough.annotationAop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author getthrough
 * @date 2019-05-09
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Config {

    @Bean
    public Reviewer reviewer() {
        return new Reviewer();
    }

}
