import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Event {
    String title, date, description;
    int audienceCount;
    List<Person> personList;

    public Event(String name){
        this.title = name;
        this.date = "";
        this.description = "";
        this.personList = new ArrayList<>();
    }

    public Event(String name, String date){
        this.title = name;
        this.date = date;
        this.description = "";
        this.personList = new ArrayList<>();
    }

    public Event(String name, String date, String description){
        this.title = name;
        this.date = date;
        this.description = description;
        this.personList = new ArrayList<>();
    }

    public Event(Event e){
        this.title = e.title;
        this.description = e.description;
        this.date = e.date;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public void addPerson(Person person){
        for(Person pers : personList){
            if(pers.getName().equals(person.getName())){
                return;
            }
        }
        this.personList.add(person);
    }

    public int getAudienceCount(){
        return this.personList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) &&
                Objects.equals(date, event.date) &&
                Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }

    @Override
    public String toString(){
        return this.title + " is a " + this.description + " and will be held at " + this.date + ".";
    }
}
