package practice10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Teacher extends Person {

    private Set<Klass> classes = new HashSet<>();

    public Teacher(String name, int age, Set<Klass> klassSet) {
        super(name, age);
        this.classes = klassSet;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, int age, HashSet<Klass> klassSet) {
        super(id, name, age);
        this.classes = klassSet;
    }

    public String introduce(){
        if(classes.size() == 0){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach " + this.getClassNameString() + ".";
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    private String getClassNameString(){
        String classNameString = "";
        for (Klass klass : classes) {
            classNameString = klass.getNumber() + ", " + classNameString;
        }
        if(classNameString.length() > 0){
            classNameString = classNameString.substring(0, classNameString.length() - 2);
        }
        return "Class " + classNameString;
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    public boolean isTeaching(Student student) {
        if (this.classes.contains(student.getKlass())) {
            return true;
        }
        return false;
    }

    public String introduceWith(Student student) {
        if (student != null && this.classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach Jerry.";
        }
        return super.introduce() + " I am a Teacher. I don't teach Jerry.";
    }
}
