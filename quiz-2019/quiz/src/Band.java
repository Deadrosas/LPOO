import java.util.ArrayList;
import java.util.List;

public class Band extends Act {

    List<Artist> artists;

    public Band(String name, String country) {
        super(name, country);
        artists = new ArrayList<>();
    }

    public List<Artist> getArtists(){
        return this.artists;
    }

    public void addArtist(Artist artist){
        this.artists.add(artist);
    }

    public boolean containsArtist(Artist artist){
        return this.artists.contains(artist);
    }
}
