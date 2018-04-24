package practice06;


public class Teacher extends Person {

    private Integer klass;

    public Teacher(String name, int age, int kClass) {
        super(name, age);
        this.klass = kClass;
    }

    public String introduce(){
        String teacherIntroduction = "I am a Teacher. I teach Class "+klass+".";
        if(klass == null){
            teacherIntroduction = "I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " " + teacherIntroduction;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
