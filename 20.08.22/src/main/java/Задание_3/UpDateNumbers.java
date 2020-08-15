package Задание_3;

public class UpDateNumbers {

    WriteNumberList wn;

    public UpDateNumbers(WriteNumberList wn) {
        this.wn = wn;
    }

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while(!thread.isInterrupted()){
                wn.changeNumberList();
                i++;
                if(thread.isInterrupted()){
                    System.out.println("Iteration change of numbers : " + i);
                }
            }
        }
    });
}
