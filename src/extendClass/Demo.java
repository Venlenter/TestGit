package extendClass;

import java.lang.reflect.*;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Harry", 80000, "1991");
        employees[1] = new Employee("Potter", 30000, "1992");
        employees[2] = new Employee("Mary", 50000, "1993");
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }

        /*Employee[] employees = new Employee[3];
        employees[0] = new Employee("Harry", 50000, "1991");
        employees[1] = new Employee("Potter", 50000, "1992");
        employees[2] = new Employee("Mary", 50000, "1993");
        //Object newArray = goodCopyOf(employees, 6);
        try {
            Method m1 = Employee.class.getMethod("getName");
            Method m2 = Employee.class.getMethod("raiseSalary", double.class);
            m1.invoke(employees[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*Employee harry = new Employee("Harry Potter", 50000, "1990");
        Class c1 = harry.getClass();
        try {
            Field f = c1.getDeclaredField("name");
            f.setAccessible(true);
            Object v = f.get(harry);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/

        /*Scanner in  = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a size：(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
            String input = in.next().toUpperCase();
            if ("BREAK".equals(input)) {
                break;
            }
            EnumClass.Size size = EnumClass.Size.valueOf(input);
            System.out.println("size=" + size);
            System.out.println("abbreviation=" + size.getAbbReviation());
            if (size == EnumClass.Size.EXTRA_LARGE) {
                System.out.println("Good job -- you get XL");
            }
        }
        Class cl1 = Date.class;*/

        /*Manager[] managers = new Manager[10];
        Employee[] employees = managers;
        managers[0] = new Manager("Boss", 80000, "1987");
        managers[0].setBonus(100);
        if (employees[0] instanceof Manager) {
            System.out.println("employees[0] instanceof Manager：" + ((Manager) employees[0]).getBonus());
        } else {
            System.out.println("employees[0] !instanceof Manager");
        }*/

        /*Employee[] staff = new Employee[3];
        Manager boss = new Manager("Boss", 80000, "1987");
        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000, "1990");
        staff[2] = new Employee("Tony", 40000, "1994");
        for (Employee e : staff) {
            System.out.println(e.getName() + " " + e.getSalary());
        }*/
    }

    public static void change(String str) {
        str = str + "Hello";
    }

    public static double max(double... values) {
        double larget = Double.MIN_VALUE;
        for (double v : values) {
            if (v > larget) {
                larget = v;
            }
        }
        return larget;
    }

    public static Object goodCopyOf(Object a, int newLength) {
        Class c1 = a.getClass();
        if (!c1.isArray()) {
            return null;
        }
        Class componentType = c1.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
