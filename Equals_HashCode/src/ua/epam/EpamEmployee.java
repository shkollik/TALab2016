package ua.epam;

/**
 * Created by Shkolik on 19.09.2016.
 */
public class EpamEmployee {
    private int age;
    private String name;
    private String position;

    public EpamEmployee(int age, String name, String position){
        this.age = age;
        this.name = name;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EpamEmployee that = (EpamEmployee) o;

        if (age != that.age) return false;
        if (!name.equals(that.name)) return false;
        return position.equals(that.position);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + position.hashCode();
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
