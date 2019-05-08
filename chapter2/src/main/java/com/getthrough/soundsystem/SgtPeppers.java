package com.getthrough.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author getthrough
 * @date 2019-04-29
 */
@Component
public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Music is playing, hey its coded by varmilo¡¡™¡™£");
    }

}
