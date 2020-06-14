public class Artist extends Person{


    public Artist(String name) {
        super(name);
    }

    public Artist(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Person person) {
        if(this.name.equals(person.getName())){
            return 0;
        }
        return 1;
    }
}
