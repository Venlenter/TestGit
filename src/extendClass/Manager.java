package extendClass;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, String hireDay) {
        super(name, salary, hireDay);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }
}
