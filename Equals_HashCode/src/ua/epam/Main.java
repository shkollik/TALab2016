package ua.epam;

public class Main {

    public static void main(String[] args) {
	    EpamEmployee emp1 = new EpamEmployee(24, "Vladyslav", "Student");
        EpamEmployee emp2 = new EpamEmployee(24, "Vladyslav", "Student");

        RD_Employee rdEmp1 = new RD_Employee(24, "Vladyslav", "Student", RD_Employee.Specialization.AT);
        RD_Employee rdEmp2 = new RD_Employee(24, "Vladyslav", "Student", RD_Employee.Specialization.AT);

        System.out.println(emp1.equals(emp2));
        System.out.println("emp1.hashCode = " + emp1.hashCode() + " = " + "emp2.hashCode = " +emp2.hashCode());

        System.out.println(rdEmp1.equals(rdEmp2));
        System.out.println("rdEmp1.hashCode = " + rdEmp1.hashCode() + " = " +  "rdemp2.hashCode = " +rdEmp2.hashCode());

        System.out.println(emp1.equals(rdEmp1));
    }
}
