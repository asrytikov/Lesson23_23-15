package p7;

public class ResThread implements Runnable{

    Res res;

    public ResThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res){
        res.variableRes = 1;
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + res.variableRes);
            res.variableRes++;
            try {
                Thread.sleep(100);
            }catch (InterruptedException exception){}
        }}
    }
}
