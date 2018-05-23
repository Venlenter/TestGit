package interfaceClass;

public class DeepCopyStudent implements Cloneable {
    private String name;
    private int age;
    private DeepCopyTeacher teacher;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public DeepCopyTeacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(DeepCopyTeacher teacher)
    {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // 浅复制时：
        // Object object = super.clone();
        // return object;

        // 改为深复制：
        DeepCopyStudent student = (DeepCopyStudent) super.clone();
        // 本来是浅复制，现在将Teacher对象复制一份并重新set进来
        student.setTeacher((DeepCopyTeacher) student.getTeacher().clone());
        return student;
    }
}
