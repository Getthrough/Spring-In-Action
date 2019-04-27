package com.getthrough.springinaction.sia.knights.configuration;

import com.getthrough.springinaction.sia.knights.BraveKnight;
import com.getthrough.springinaction.sia.knights.Knight;
import com.getthrough.springinaction.sia.knights.Quest;
import com.getthrough.springinaction.sia.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *     knight java config
 * </p>
 *
 * @author getthrough
 * @date 2019-04-27
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
