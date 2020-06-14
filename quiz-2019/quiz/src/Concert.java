import java.util.ArrayList;
import java.util.List;

public class Concert {
    String city, country, date;
    List<Act> acts;
    int count;

    public Concert(String city, String country, String date){
        this.city = city;
        this.country = country;
        this.date = date;
        acts = new ArrayList<>();
        this.count = 1;
    }

    public String getCity(){
        return this.city;
    }

    public String getCountry(){
        return this.country;
    }

    public String getDate(){
        return this.date;
    }

    public void addAct(Act act){
        this.acts.add(act);
    }

    public List<Act> getActs(){
        return this.acts;
    }

    public int getCount(){
        return this.count;
    }

    public void incrementCount(){
        this.count++;
    }

    public boolean isValid(Ticket ticket) throws InvalidTicket{
        return this.equals(ticket.getConcert());
    }

    public boolean participates(Artist artist){
        for(Act act : acts){
            if (act.equals(artist)) return true;
            if (act.getClass() == Band.class){
                if(((Band) act).getArtists().contains(artist)) return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Concert c = (Concert) obj;
        return this.date.equals(c.getDate()) && this.country.equals(c.getCountry()) && this.city.equals(c.getCity());
    }

    @Override
    public int hashCode(){
        int hash = 7;

        for (int i = 0; i < this.date.length(); i++) {
            hash = hash*31 + date.charAt(i);
        }
        return hash;
    }
}
