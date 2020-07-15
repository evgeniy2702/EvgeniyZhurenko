package HomeworkNasledovanie;

public class DeviceMain {

    public static void main(String[] args) {

//        создание объекта девайс и его характеристик

        Device device = new Device();
        device.setName("Maxwell");
        device.setSound("Pzz");
        device.sound();
        device.show();
        System.out.println();
        device.describe();
        System.out.println();

// Создание объекта чайник и его характеристик

        Kettle kettle = new Kettle();
        kettle.setSound("Psh-sh");
        kettle.setCurrent(5);
        kettle.setVoltage(220);
        kettle.show();
        kettle.sound();
        System.out.println();
        kettle.describe();
        System.out.println();

// Создание объекта авто и его характеристик

        Car car = new Car("ZaZ", 5, 40);
        car.setSound("Zh-Zh-Zh");
        car.show();
        car.sound();
        System.out.println();
        car.describe();
    }
}
