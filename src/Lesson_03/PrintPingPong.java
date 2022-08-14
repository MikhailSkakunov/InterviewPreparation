package Lesson_03;

import java.util.Objects;

public class PrintPingPong {

    private volatile String currentString = "Ping!";
    private final Object mon = new Object();

    public void printPing() {
        synchronized(mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (!Objects.equals(currentString, "Ping!")) {
                        mon.wait();}
                        System.out.println("Ping!");
                        currentString = "Pong!";
                    mon.notify();}
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }

    public void printPong() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 10; i++) {
                        while (!Objects.equals(currentString, "Pong!")) {
                            mon.wait();}
                        System.out.println("Pong!");
                        currentString = "Ping!";
                        mon.notify();}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
