package HomeThread;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {

    int l;
    final int[] arr;

    public ArrayRandom(int l) {
        this.l = l;
        this.arr = new int[l];
    }

    public synchronized void fullArr() {
        for (int i = 0; i < l; i++) {
            arr[i] = new Random().nextInt(10);
        }
    }

    public synchronized int sumArr() {
        int sum = 0;
        try {
            if(Arrays.stream(arr).average().isPresent()) {
                sum = Arrays.stream(arr).sum();
            } }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public synchronized double averageArr() {
        double average = 0.0;
        try {
            if(Arrays.stream(arr).average().isPresent()) {
                average = Arrays.stream(arr).average().getAsDouble();
            } }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return average;
    }
}
