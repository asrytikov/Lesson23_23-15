package p2;

public class GetData implements Runnable{

    private Store store;

    public GetData(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.getData();
        }
    }

}
