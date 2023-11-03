package p3;

import java.util.concurrent.Semaphore;

public class ResThread implements Runnable{
    Res res;
    Semaphore semaphore;
    String name;

    public ResThread(Res res, Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        this.res = res;
    }

    @Override
    public void run() {
       try {
           System.out.println(name + " wait permit");
           semaphore.acquire();
           res.varRes = 1;
           for (int i = 0; i < 5; i++) {
               System.out.println(this.name + " : " + res.varRes);
               res.varRes++;
               Thread.sleep(100);
           }
       }catch (InterruptedException exception){
           exception.printStackTrace();
       }

        System.out.println(name + " put permit");
        semaphore.release();
    }
}
