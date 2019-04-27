package com.getthrough.springinaction.sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author getthrough
 * @desc
 * @date 2019-04-27
 */
public class KnightMain {

    public static void main(String[] args) {

        /*
            based on xml configuration file
         */
        // ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*
           based on annotation
         */
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.getthrough.springinaction.sia.knights");

        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();

    }

}
