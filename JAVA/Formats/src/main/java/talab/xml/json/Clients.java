package talab.xml.json;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Clients {
    private int id;
    private String surname;
    private String name;
    private String identificationCode;
    private String phoneNumber;

    public Clients() {
    }

    public Clients(int id, String surname, String name, String identificationCode, String phoneNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.identificationCode = identificationCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", identificationCode='" + identificationCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
