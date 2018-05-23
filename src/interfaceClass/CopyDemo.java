package interfaceClass;

import commonClass.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class CopyDemo {
    public static void main(String[] args) throws Exception {
        int[] luckyNumbers = {2, 3, 5, 7, 11, 13};
        int[] cloned = luckyNumbers.clone();
        luckyNumbers[0] = 0;
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(cloned));

        /*Employee employees = new Employee("Harry", 80000, new Date(1994, 10,13));
        ShallowCopyTeacher teacher = new ShallowCopyTeacher();
        teacher.setName("Mary");
        employees.setTeacher(teacher);
        Employee clonePerson = employees.clone();
        employees.setName("Potter");
        employees.setHireDay(new Date(2018,10,15)); //已clone
        teacher.setName("Change");  //teacher指向的是同一个
        System.out.println("employees：" + employees.getName() + "  "
                + employees.getHireDay() + "  TeacherName:" + employees.getTeacher().getName());
        System.out.println("clonePerson：" + clonePerson.getName() + "  "
                + clonePerson.getHireDay() + "  TeacherName:" + employees.getTeacher().
        getName());*/
    }
}
