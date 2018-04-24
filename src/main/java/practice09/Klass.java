package practice09;

import java.util.HashSet;
import java.util.Set;

public class Klass {

    private Integer number;

    private Person leader;

    private Set<Student> memberSet = new HashSet<>();

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
        if (!memberSet.contains(leader)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = leader;
    }

    public void appendMember(Student student) {
        memberSet.add(student);
    }
}
