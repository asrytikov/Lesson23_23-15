package p2;

public class Store {

    private int dataCount=0;

    public synchronized void putData(){
        while (dataCount>=3){
            try{
                wait();
            }catch (InterruptedException exception){}
        }
        dataCount++;
        System.out.println("PutData put 1 box");
        System.out.println("In store: " + dataCount);
        notify();
    }

    public synchronized void getData(){
        while (dataCount<1){
            try{
                wait();
            }catch (InterruptedException exception){}
        }
        dataCount--;
        System.out.println("GetData get 1 box");
        System.out.println("In store: " + dataCount);
        notify();
    }

}
