package p5;

import java.util.concurrent.Phaser;

public class MyFThread implements Runnable{

    Phaser phaser;
    String name;

    public MyFThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println(name + " exec phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();

        try{
            Thread.sleep(100);
        }catch (InterruptedException exception){}

        System.out.println(name + " exec phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();
        try{
            Thread.sleep(100);
        }catch (InterruptedException exception){}

        System.out.println(name + " exec phase " + phaser.getPhase());
        phaser.arriveAndDeregister();
    }
}
