package practice11;

public class Student extends Person {

    private Klass klass;

    public Student(String name, Integer age, Klass kClass) {
        super(name, age);
        this.klass = kClass;
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        if(this.equals(klass.getLeader())){
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        }
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
