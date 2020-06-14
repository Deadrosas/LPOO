public class Artist extends Act{

    public Artist(String name, String country) {
        super(name, country);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Artist artist = (Artist) obj;
        return this.name.equals(artist.getName()) && this.country.equals(artist.getCountry());
    }
}
