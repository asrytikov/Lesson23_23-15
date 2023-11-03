package p2;

public class PutData implements Runnable{

    private Store store;

    public PutData(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.putData();
        }
    }
}
