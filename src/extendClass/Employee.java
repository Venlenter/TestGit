package extendClass;

public class Employee implements Comparable{
    private String name;
    private double salary;
    private String hireDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, double salary, String hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    @Override
    public int compareTo(Object otherObject) {
        Employee other = (Employee) otherObject;
        return Double.compare(salary, other.salary);
    }
}
