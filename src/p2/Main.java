package p2;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        PutData putData = new PutData(store);
        GetData getData = new GetData(store);
        new Thread(putData).start();
        new Thread(getData).start();

    }

}
