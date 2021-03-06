package com.getthrough.springinaction.sia.knights.configuration;

import com.getthrough.springinaction.sia.knights.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 *     knight java config
 * </p>
 *
 * @author getthrough
 * @date 2019-04-27
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

}
