import java.util.ArrayList;
import java.util.List;

public abstract class Act {
    String name, country;

    List<Artist> artists;

    public Act(String name, String country){
        this.name = name;
        this.country = country;
        artists = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }
}
