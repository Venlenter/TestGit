package interfaceClass;

/**
 * 浅拷贝
 */
public class ShallowCopyStudent implements Cloneable {
    private String name;
    private int age;
    private ShallowCopyTeacher shallowCopyTeacher;

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

    public ShallowCopyTeacher getShallowCopyTeacher()
    {
        return shallowCopyTeacher;
    }

    public void setShallowCopyTeacher(ShallowCopyTeacher shallowCopyTeacher)
    {
        this.shallowCopyTeacher = shallowCopyTeacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Object object = super.clone();
        return object;
    }
}
