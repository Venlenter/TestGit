package EffectiveJavaFolder.extendClass;

public class Student extends Person implements Cloneable{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
