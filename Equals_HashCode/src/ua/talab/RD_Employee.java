package ua.talab;

/**
 * Created by Shkolik on 19.09.2016.
 */
public class RD_Employee extends CompanyEmployee{

    private Specialization specialization;
    public enum Specialization{
        AT, BI, JAVA, FT, JS
    }

    public RD_Employee(int age, String name, String position, Specialization specialization) {
        super(age, name, position);
        this.specialization = specialization;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RD_Employee that = (RD_Employee) o;

        return specialization == that.specialization;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + specialization.hashCode();
        return result;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
}
