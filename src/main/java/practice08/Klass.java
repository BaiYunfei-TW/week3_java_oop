package practice08;

public class Klass {

    private Integer number;

    private Person leader;

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
        this.leader = leader;
    }
}
