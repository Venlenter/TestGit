package interfaceClass;

public class DeepCopyDemo {
    public static void main(String[] args) throws Exception
    {
        DeepCopyTeacher teacher = new DeepCopyTeacher();
        teacher.setName("Delacey");
        teacher.setAge(29);

        DeepCopyStudent student1 = new DeepCopyStudent();
        student1.setName("Dream");
        student1.setAge(18);
        student1.setTeacher(teacher);

        DeepCopyStudent student2 = (DeepCopyStudent) student1.clone();
        System.out.println("拷贝后");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());
        System.out.println("修改老师的信息后-------------");

        // 修改老师的信息
        teacher.setName("Jam");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());
    }
}
