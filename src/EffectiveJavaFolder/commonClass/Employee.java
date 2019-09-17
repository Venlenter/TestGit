package EffectiveJavaFolder.commonClass;

import EffectiveJavaFolder.interfaceClass.ShallowCopyTeacher;

import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Employee implements Comparable, Cloneable{
    private String name;
    private double salary;
    private Date hireDay;
    private ShallowCopyTeacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public ShallowCopyTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(ShallowCopyTeacher teacher) {
        this.teacher = teacher;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, double salary, Date hireDay) {
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

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
