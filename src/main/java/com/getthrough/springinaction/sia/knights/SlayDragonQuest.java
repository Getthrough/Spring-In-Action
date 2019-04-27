package com.getthrough.springinaction.sia.knights;

import java.io.PrintStream;

/**
 * @author getthrough
 * @date 2019-04-27
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!");
    }
}
