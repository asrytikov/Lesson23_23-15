package p3;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Res res = new Res();
        /*new Thread(new ResThread(res, semaphore, "Thread 1")).start();
        new Thread(new ResThread(res, semaphore, "Thread 2")).start();
        new Thread(new ResThread(res, semaphore, "Thread 3")).start();*/

        for (int i = 0; i < 10; i++) {
            new Thread(new ResThread(res, semaphore, "Thread "+i)).start();
        }
    }
}