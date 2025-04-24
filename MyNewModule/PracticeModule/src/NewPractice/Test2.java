package NewPractice;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Thread t = new Thread(System.out::println);
        t.start();
    }

    public static class doSomeThing extends Thread {
        @Override
        public void run() {
            System.out.println("Hello2");
            ;
        }
    }
}