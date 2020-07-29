package Task_3;

public class RunIntegerClass {

    public static void main(String[] args) {
        IntegerClass integerClass = new IntegerClass(10);
        System.out.println(integerClass.toString());
        System.out.println("\nSUM array = " + integerClass.sumArr(integerClass.getArrInt()));
        System.out.println("\nAVERAGE array = " + integerClass.averageArr(integerClass.getArrInt()));
        System.out.println("\nMAX array = " + integerClass.maxArrElem(integerClass.getArrInt()));
        System.out.println("\nMIN array = " + integerClass.minArrElem(integerClass.getArrInt()));
    }
}
