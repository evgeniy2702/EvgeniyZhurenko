package Singletone_thread;

public class Singleton_threads {

    public String data;
    private static volatile Singleton_threads instance;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data='" + data;
    }

    public static Singleton_threads getInstance(){
        if(instance == null) {
            synchronized (Singleton_threads.class){
                if(instance == null) {
                    instance = new Singleton_threads();
                }
            }
        }
        return instance;
    }

}
