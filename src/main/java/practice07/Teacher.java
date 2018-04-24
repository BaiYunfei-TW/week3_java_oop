package practice07;


public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age, Klass kClass) {
        super(name, age);
        this.klass = kClass;
    }

    public String introduce(){
        if(klass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduceWith(Student student) {
        if (student != null && student.getKlass().getNumber() == this.klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach Jerry.";
        }
        return super.introduce() + " I am a Teacher. I don't teach Jerry.";
    }
}
