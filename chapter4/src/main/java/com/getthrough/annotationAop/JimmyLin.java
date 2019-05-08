package com.getthrough.annotationAop;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author getthrough
 * @date 2019-05-09
 */
@Component
public class JimmyLin implements Artist {

    @Override
    public void playPiano(List<String> trackList) {
        System.out.println("Artist " + this.getClass().getName() + " will play :[");
        for (int i = 0; i < trackList.size(); i++) {
            if (i == trackList.size() - 1) {
                System.out.println(trackList.get(i) + "]");
            } else {
                System.out.println(trackList.get(i) + ",");
            }
        }
    }

    @Override
    public void singGuitarSongs(List<String> songList) {
        System.out.println("Artist " + this.getClass().getName() + "will play songs : " + songList);
    }
}
