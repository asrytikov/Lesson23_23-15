package p7;

public class Main {

    public static void main(String[] args) {
        Res res = new Res();
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new ResThread(res));
            thread.setName("ResThread" + i);
            thread.start();
        }
    }

}
