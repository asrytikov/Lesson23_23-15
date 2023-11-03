package p1;

public class Res {
    int variableRes = 0;

    synchronized void inc(){
        variableRes = 1;
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + variableRes);
            variableRes++;
            try {
                Thread.sleep(100);
            }catch (InterruptedException exception){}
        }}
    }
