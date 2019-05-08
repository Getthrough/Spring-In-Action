package com.getthrough.annotationAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author getthrough
 * @date 2019-05-09
 */
public class ArtistMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.getthrough.annotationAop");
        Artist artist = context.getBean(Artist.class);
        artist.playPiano(getPianotrackList());
    }

    private static List<String> getPianotrackList() {
        List<String> list = new ArrayList<>(3);
        list.add("菊次郎的夏天");
        list.add("你离开了南京，从此没有人和我说话");
        list.add("天空之城");
        return list;
    }

}
