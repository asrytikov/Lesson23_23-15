package p4;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Putter implements Runnable{

    Exchanger<String> exchanger;
    String mes;

    public Putter(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.mes = "Hello all";
    }

    @Override
    public void run() {
        try {
            mes = exchanger.exchange(mes, 10L, TimeUnit.SECONDS);
            System.out.println("Put mes: " + mes);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }catch (TimeoutException exception2){}
    }
}
