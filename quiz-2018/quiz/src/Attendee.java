public class Attendee extends Person{
    boolean hasPaid;

    public Attendee(String name) {
        super(name);
        this.hasPaid = false;
    }

    public Attendee(String name, int age) {
        super(name, age);
        this.hasPaid = false;
    }

    public boolean hasPaid(){
        return this.hasPaid;
    }

    @Override
    public String toString() {
        return "Attendee " + this.getName() + (this.hasPaid() ? " has" : " hasn't") + " paid its registration.";
    }

    @Override
    public int compareTo(Person person) {
        if(this.name.equals(person.getName())){
            return 0;
        }
        return 1;
    }
}
