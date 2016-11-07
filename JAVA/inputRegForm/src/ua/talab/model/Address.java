package ua.talab.model;

/**
 * Created by Shkolik on 22.09.2016.
 */
public class Address {
    private String index;
    private String city;
    private String address;
    private String houseNumber;
    private String flatNumber;

    public Address(String s) {
        String [] address = s.split(" ");
        this.index = address[0];
        this.city = address[1];
        this.address = address[2];
        this.houseNumber = address[3];
        this.flatNumber = address[4];
    }

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
