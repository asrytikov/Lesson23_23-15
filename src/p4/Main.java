package p4;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new Putter(exchanger)).start();
        new Thread(new Getter(exchanger)).start();
    }
}
