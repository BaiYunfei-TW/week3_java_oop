package practice05;


public class Student extends Person {

    private int klass;

    public Student(String name, int age, int kClass) {
        super(name, age);
        this.klass = kClass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class 2.";
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
