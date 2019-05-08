package com.getthrough.annotationAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 审查员，负责演出节目曲目审查
 *
 * @author getthrough
 * @date 2019-05-09
 */
@Aspect
public class Reviewer {

    private List<String> notAllowedSongs = Arrays.asList("梵高先生", "你离开了南京，从此没有人和我说话");

    @Pointcut("execution(* com.getthrough.annotationAop.JimmyLin.playPiano(java.util.List)) && args(trackList)")
    public void pt(List<String> trackList) {

    }

    @Before("pt(trackList)")
    public void review(List<String> trackList) {
        if (!CollectionUtils.isEmpty(trackList)) {
            Iterator<String> iter = trackList.iterator();
            int amount = 0;
            while (iter.hasNext()) {
                String track = iter.next();
                if (notAllowedSongs.contains(track)) {
                    iter.remove();
                    ++amount;
                }
            }
            System.out.println("review method killed " + amount  + " song(s)");
        }
    }


}
