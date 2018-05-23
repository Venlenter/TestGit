package interfaceClass;

public class ShallowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopyTeacher shallowCopyTeacher = new ShallowCopyTeacher();
        shallowCopyTeacher.setName("Delacey");
        shallowCopyTeacher.setAge(29);

        ShallowCopyStudent student1 = new ShallowCopyStudent();
        student1.setName("Dream");
        student1.setAge(18);
        student1.setShallowCopyTeacher(shallowCopyTeacher);

        //浅克隆
        ShallowCopyStudent shallowCopyStudent = (ShallowCopyStudent) student1.clone();
        System.out.println("拷贝后");
        System.out.println(shallowCopyStudent.getName());
        System.out.println(shallowCopyStudent.getAge());
        System.out.println(shallowCopyStudent.getShallowCopyTeacher().getName());
        System.out.println(shallowCopyStudent.getShallowCopyTeacher().getAge());
        System.out.println("修改老师的信息后-------------");

        // 修改老师的信息
        shallowCopyTeacher.setName("Jam");
        System.out.println(student1.getShallowCopyTeacher().getName());
        System.out.println(shallowCopyStudent.getShallowCopyTeacher().getName());
    }
}
