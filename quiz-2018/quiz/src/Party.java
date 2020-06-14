import java.util.ArrayList;
import java.util.List;

public class Party extends Event{

    List<Event> eventList;

    public Party(String str1, String str2, String str3){
        super(str1, str2, str3);
        eventList = new ArrayList<>();
    }

    public void addEvent(Event event){
        this.eventList.add(event);
        this.personList.addAll(event.getPersonList());
    }

}
