package Coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {


        public RacingClock() {
            start();
        }

        @Override
        public void run() {
            try {
                while (numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                    numSeconds --;
                }
                System.out.println("Марш!");
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
                return;
            }
        }
    }
}