package HomeWorkLinkedList.Human;

public class Address {

    private City city;
    private String street;
    private String number;

    public Address(City city, String street, String number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Address() {
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Адресс: " +
                "город " + city + '\'' +
                ", улица'" + street + '\'' +
                ", № дома" + number;
    }
}
