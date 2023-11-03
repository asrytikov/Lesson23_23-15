package p4;

import java.util.concurrent.Exchanger;

public class Getter implements Runnable{

    Exchanger<String> exchanger;
    String mes;

    public Getter(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.mes = "Hello Thread";
    }

    @Override
    public void run() {
        try {
            mes = exchanger.exchange(mes);
            System.out.println("Get mes: " + mes);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
