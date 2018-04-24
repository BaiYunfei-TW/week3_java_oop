package practice10;

import java.util.HashSet;
import java.util.Set;

public class Klass {

    private Integer number;

    private Person leader;

    private Set<Student> students = new HashSet<>();

    public Klass(Integer number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Person getLeader() {
        return leader;
    }

    public void assignLeader(Person leader) {
        if (!students.contains(leader)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = leader;
    }

    public void appendMember(Student student) {
        students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Klass && this.getNumber() == ((Klass) obj).getNumber()) {
            return true;
        }
        return false;
    }
}
