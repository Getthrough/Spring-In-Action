package com.getthrough.springinaction.sia.knights;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.PrintStream;

/**
 * @author getthrough
 * @date 2019-04-27
 */
@Aspect
public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    // 声明切入点
    @Pointcut("execution(* com.getthrough.springinaction.sia.knights.BraveKnight.*(..))")
//    @Pointcut("execution(* *.embarkOnQuest(..))")
    private void knightPointCut() {
    }

    @Before("knightPointCut()")
    public void singBeforeQuest() {
        printStream.println("Fa la la, the knight is so brave!");
    }

    @Around("knightPointCut()")
    public void useJoinPointBeforeInvoke(ProceedingJoinPoint jp) {
        System.out.println("invoke before ProceedingJoinPoint...");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("invoke after ProceedingJoinPoint...");
    }

    @After("knightPointCut()")
    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }

}
