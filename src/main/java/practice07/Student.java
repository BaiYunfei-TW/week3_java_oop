package practice07;


public class Student extends Person {

    private Klass klass;

    public Student(String name, int age, Klass kClass) {
        super(name, age);
        this.klass = kClass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
