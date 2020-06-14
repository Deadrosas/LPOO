public class Speaker extends Person{
    int fee;

    public Speaker(String name) {
        super(name);
        fee = 0;
    }

    public Speaker(String name, int age) {
        super(name, age);
        fee = 0;
    }

    public Speaker(String name, int age, int fee) {
        super(name, age);
        this.fee = fee;
    }

    public int getFee(){
        return this.fee;
    }

    @Override
    public String toString() {
        return "Speaker " + this.name + " has a fee value of " + this.fee + ".";
    }

    @Override
    public int compareTo(Person person) {
        if(this.name.equals(person.getName())){
            return 0;
        }
        return 1;
    }
}
