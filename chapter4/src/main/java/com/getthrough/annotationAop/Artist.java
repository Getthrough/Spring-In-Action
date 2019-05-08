package com.getthrough.annotationAop;

import java.util.List;

/**
 * 表演艺术家接口，定义几种表演方式
 *
 * @author getthrough
 * @date 2019-05-09
 */
public interface Artist {

    /**
     * 演奏钢琴曲目
     * @param trackList 曲目列表
     */
    void playPiano(List<String> trackList);

    /**
     * 演唱吉他歌曲
     * @param songList 歌曲列表
     */
    void singGuitarSongs(List<String> songList);

}
